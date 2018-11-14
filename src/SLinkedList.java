import java.util.LinkedList;

/**
 * 单链表
 */
public class SLinkedList {
    int length;
    SNode head;
    SNode last;
    public SLinkedList(int[] array){
        this.length = array.length;
        for(int i = 0;i<length;i++){
            SNode newNode = new SNode(array[i]);
            if(length==0){
                head.next = newNode;
            }
            last.next = newNode;
            last = last.next;
        }

    }
    public void addNode(int newValue){
        SNode newNode = new SNode(newValue);
        last = last.next;
        last = newNode;
        length = length + 1;
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
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
}
