public class QUEUEUSINGLINKEDLIST {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queue{
       static  Node frontNode=null;
        static Node rearNode=null;
        private  static boolean isempty(){
            return frontNode==null && rearNode==null;
        }
        private   void enqueue(int data){
            Node newNode=new Node(data);
            if(rearNode==null){
                frontNode=rearNode=newNode;
            }
            else{
            rearNode.next=newNode;
            rearNode=newNode;;
            }
        }
        private  int dequeue(){
            if(isempty()){
                return -1;
            }
            int peekEle=frontNode.data;
            if(frontNode==rearNode){
                frontNode=rearNode=null;
            }
            frontNode=frontNode.next;
            return peekEle;
        }
        private   int peek(){
            if(isempty()){
                return -1;
            }
            return frontNode.data;
        }
        private  void  print(){
            Node temp=frontNode;
            while(temp!=null){
                System.err.print(temp.data+"->");
                temp=temp.next;
            }
            System.err.println("NULL");
        }
    }
    public static void main(String[] args) {
        Queue qu=new Queue();
        qu.enqueue(1);   //enqueue objects to queue
        qu.enqueue(2);
        qu.enqueue(3);
        qu.enqueue(4);
        qu.enqueue(5);
        qu.print(); //calling function to print queue
    }
}

