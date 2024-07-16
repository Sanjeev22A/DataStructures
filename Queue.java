public class Queue extends DataStructure {
    Node front;
    Node rear;
    Queue(){
        front=null;
        rear=null;
    }
    boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }
    void enqueue(int data){
        if(front==null){
            front=new Node(data);
            rear=front;
        }
        else{
            Node newNode=new Node(data);
            rear.next=newNode;
            rear=newNode;
        }
    }

    int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
        int data=front.data;
        System.out.println("Dequed data : "+data);
        front=front.next;
        return data;
        }
    }
    void display(){
        super.display(front,rear);
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.enqueue(5);
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
