public class Stringmethods {
    public void stringfunc(String s){

    System.out.println("String length: " + s.length());
    System.out.println(s.isEmpty());
    System.out.println(s.indexOf("G"));
    System.out.println((s.lastIndexOf("h")));
    System.out.println(s.contains("Aniket"));
    System.out.println(s.strip());
    System.out.println(s.replace("Ankit","Aniket"));
    System.out.println(s.substring(1,4));

    System.out.println(s);


    }
    public static void main(String[] args) {
        Stringmethods sm = new Stringmethods();
        sm.stringfunc("Ankit Ghosh");

    }


}
