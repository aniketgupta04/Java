import java.util.Arrays;

public class Swaparray {
public static void main(String [] args){
    int arr[]={34,56,33,67,77,34};

    System.out.println("Original array:"+ Arrays.toString(arr));
    swap(arr,2,5);
    System.out.println("Array after swapping:"+ Arrays.toString(arr));
    reverse(arr);
    System.out.println("Array after reversing:"+ Arrays.toString(arr));
}

static void reverse(int[] arr){
    int start =0;
    int end = arr.length -1;
    while (start < end){
        swap(arr, start, end);
        start++;
        end--;
    }
}
public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

}
