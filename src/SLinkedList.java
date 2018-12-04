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

    }
    public static void main(String[] args){
        int[] array = {0,1,3,4,5};
        SLinkedList sLinkedList = new SLinkedList(array);
        //System.out.println(sLinkedList.last.value);
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
