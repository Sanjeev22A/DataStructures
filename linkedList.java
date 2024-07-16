class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class DataStructure{
    void display(Node top){
        Node current=top;
        while(current != null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    void display(Node top,Node bottom){
        Node front=top;
        Node rear=bottom;
        while(front!=rear.next){
            System.out.print(front.data+ " ");
            front=front.next;
        }
        System.out.println();
    }
}
public class linkedList extends DataStructure {
    Node head=null;
    void add(int data){
        if(head==null){
            head=new Node(data);
        }
        else{
            Node current=head.next;
            Node prev=head;
            while(current != null){
                prev=current;
                current=current.next;
            }
            current=new Node(data);
            prev.next=current;
        }
    }
    //removes the first occurence of data
    void remove(int data){
        if(head.data==data){
            head=head.next;
            return;
        }
        else{
            Node current=head.next;
            Node prev=head;
            while(current != null){
                if(current.data==data){
                    prev.next=current.next;
                    break;
                }
                prev=current;
                current=current.next;
            }

        }
    }
    void display(){
        super.display(head);
        
    }
    public static void main(String[] args){
        linkedList l=new linkedList();
        l.add(5);
        l.add(6);
        l.add(7);
        l.display();
        l.remove(6);
        l.display();
    }
}
