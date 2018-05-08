package node;

public class Queue {
    
    Node head =null;
    /**
     * methods are created to handle all the elements of the queues like 
     * enqueue or dequeue
     * @return 
     */
    public boolean isEmpty(){
        return head == null ? true : false;
    }
    /**
     * 
     * @param newNode 
     */
    public void Enqueue(Node newNode){
        Node temp = head;
        while(temp.next!= null)
            temp = temp.next;      
        temp.next = newNode;
    }
    /**
     * 
     * @return 
     */
    public Node dequeue(){
        Node temp;
        Node pre =head;
        while(pre.next.next != null)
            pre = pre.next;
        
        temp = pre.next;
        pre.next = null;
        System.gc();
        return temp;
    }
    
}
