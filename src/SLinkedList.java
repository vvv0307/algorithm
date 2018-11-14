import java.util.LinkedList;

/**
 * 单链表
 */
public class SLinkedList {
    private int length;
    private SNode head;
    private SNode last;
    public SNode getHead(){
        return head;
    }
    public int length(){
        return length;
    }
    public SLinkedList(int[] array){
        this.length = array.length;
        for(int i = 0;i<length;i++){
            SNode newNode = new SNode(array[i]);
            if(length==0){
                head.next = last;
            }
            last = newNode;
            last = last.next;
            length = length + 1;
        }

    }
    public void addNode(int newValue){
        SNode newNode = new SNode(newValue);
        last = last.next;
        last = newNode;
        length = length + 1;
    }
    public static void main(String[] args){
        int[] array = {0,1,3,4,5};
        SLinkedList sLinkedList = new SLinkedList(array);
        SNode head = sLinkedList.getHead();
        head = head.next;
        if(head.next!=null){
            System.out.println(head.value);
        }
    }
}

/**
 * 单链表节点
 */
class SNode{
    SNode next;
    int value;
    public SNode(int value){
        this.value = value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
