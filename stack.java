public class stack extends DataStructure {
    Node top;
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
        int data=top.data;
        System.out.println("Deleted data : "+data);
        top=top.next;
        return data;
        }
    }
    void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }
    void display(){
        super.display(top);
    }
    public static void main(String[] args){
        stack s=new stack();
        s.push(5);
        s.push(6);
        s.display();
        s.pop();
        s.pop();
        s.pop();

    }

}
