package src.com.aniket;
import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    public void firstinser(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null) tail=head;
        size ++;
    }

    public void insertlast(int val){

        if (tail==null) {
            firstinser(val);
            return;
        }

        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            firstinser(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
            
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    public void deletefirst(){
        int val=head.value;
        head=head.next;
        size--;
        System.out.println(val);
    }

    public void deletelast(){
        if(size<=1){
            deletefirst();
            return;
        }
        Node lastnode=get(size-2);
        tail=lastnode;
        tail.next=null;
        size--;

    }
    public void delete(int index){
        if(index==0){deletefirst();
            return;
        }
        if(index==size){
            deletelast();
            return;
        }
        
        Node node=get(index-1);
       int val= node.next.value;
       
       node.next=node.next.next;
       

       System.out.println(val);
    }
    public Node getvalue(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node get(int index){

        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
            
        }
        System.out.println("END");
    }

private class Node{

    private int value;
    private Node next;

    public Node(int val){
        this.value=val;
    }

    public Node(int val,Node next){
        this.value=val;
        this.next=next;
    }
}
}

