import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 class Student{
    String name;
    int age;
    int id;
     Student(String n, int a, int id) {
        this.name=n;
        this.age=a;
        this.id=id;

    }
    @Override
    public String toString() {
        return id + " - " + name + " (Age: " + age + ")";
    }
}


  class Management{

    public static void main(String[] args) {

        System.out.println("Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Students");
        System.out.println("4. Exit");
        int c;
        Scanner sc = new Scanner(System.in);
         Map<Integer,Student> students=new HashMap<>();
        do{

        System.out.print("Enter your choice: ");

         c=sc.nextInt();



        switch(c){
            case 1:
            System.out.println("Enter number of students to add: ");
            int n = sc.nextInt();
            int i=0;
            while(i<n){
                sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Student Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            students.put(id,new Student(name,age,id));
            i++;
            }
            break;

            case 2:

            if(students.isEmpty()){
                System.out.println("No students to display.");
            }
            else{
                System.out.println("Students List:");

                for(Student s: students.values()){
                    System.out.println("Name: " + s.name + ", Age: " + s.age + ", ID: " + s.id);
                }

            }
            break;
            case 3:
            System.out.println("Enter Student ID to search: ");
            int search=sc.nextInt();
            if(students.containsKey(search)){
                Student s= students.get(search);
                System.out.println("Student Found: Name: " + s.name + ", Age: " + s.age + ", ID: " + s.id);
            }
            else{
                System.out.println("Student not found with ID: " + search);
            }
            break;
            case 4:
            System.out.println("Exiting the program.");
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
     }while(c !=4);
     sc.close();
    }
}


