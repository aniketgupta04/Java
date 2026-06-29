
import java.util.*;
public class Bubble {
        public static int[] swap(int arr[], int j){

            int temp=arr[j];
            arr[j]= arr[j+1];
            arr[j+1]=temp;

            return arr;
        }

        public static void main(String[] args) {

            int[] arr= {13,46,24,52,20,9};
            int n = arr.length;

            for(int i=n-1;i>0;i--){
                for(int j=0;j<i;j++){

                    if(arr[j]>arr[j+1]){
                        swap(arr,j);
                    }
                    else if(i==1) {
                        break;
                    }
                    else{
                        continue;
                    }
                }
            }
            for(int num: arr) {
                System.out.print(num+" " );
            }
        }
}


