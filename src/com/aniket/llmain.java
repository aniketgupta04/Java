package src.com.aniket;
public class llmain {
  
    public static void main(String[] args) {
           LL list =new LL();
        list.firstinser(5);
        list.firstinser(3);
        list.firstinser(4);
        list.firstinser(10);
        list.firstinser(17);
        list.display();
        list.firstinser(20);
        list.insertlast(26);
        list.insert(100, 4);

        list.display();
        list.deletefirst();
        list.deletelast();
        list.display();
        list.delete(4);
        list.display();
      
    }
}

