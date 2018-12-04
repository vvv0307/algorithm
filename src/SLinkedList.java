import java.util.LinkedList;

/**
 * 单链表
 */
public class SLinkedList {
    private int length;
    private SNode head;
    private SNode last;
    public int length(){
        return length;
    }
    public SLinkedList(int[] array){
        this.length = array.length;
        SNode first = new SNode(array[0]);
        this.head = new SNode();
        head.next = first;
        for(int i = 1;i<array.length;i++){
            SNode sNode = new SNode(array[i]);
            first.next = sNode;
            first = first.next;
        }
        last = first;
    }
    public void addNode(int newValue){
        last.next = new SNode(newValue);
        last = last.next;
    }

    public boolean addNode(int newValue,int index){
        if(index <= 0 || index >= this.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index == 1){
            SNode newSNode = new SNode(newValue);
            newSNode.next = this.head.next;
        }
        SNode pre = this.head;
        SNode next;
        for(int i = 0;i<this.length;i++){
            pre = pre.next;
            if(i == (index -2)){
                SNode newNode = new SNode(newValue);
                next = pre.next;
                pre.next = newNode;
                newNode.next = next;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] array = {0,1,3,4,5};
        SLinkedList sLinkedList = new SLinkedList(array);
        sLinkedList.addNode(14,2);
        SNode sNode =sLinkedList.head.next;
        while (sNode != null){
            System.out.println(sNode.value);
            sNode = sNode.next;
        }
    }
}

/**
 * 单链表节点
 */
class SNode{
    SNode next;
    int value;
    public SNode(){}


    public SNode(int value){
        this.value = value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
