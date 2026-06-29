

public class Sorted{

    public static void main(String[] args) {
       

        int a[]={ 1,2,8,4,9,12};

        System.out.println(check(a,0));
        
    }

    static boolean check(int a[], int index){

        if(index==a.length-1){
            return true;
        }

        if(a[index] <= a[index+1]){
            return check(a, index+1);
        }
         else {
            return false;
        }




    }

}
