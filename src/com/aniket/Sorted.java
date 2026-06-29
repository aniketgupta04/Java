
package src.com.aniket;

class Sorted{

    public static void main(String[] args) {
       

        int a[]={ 1,2,9,8,9,12};

        System.out.println(check(a,0));
        
    }

    static boolean check(int a[], int index){

        if(index==a.length-1){
            return true;
        }


            return a[index]<a[index+1] && check(a, index+1);





    }

}
