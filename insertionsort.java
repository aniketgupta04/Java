public class insertionsort {
    void sort(int [] arr  ){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j);
                j--;
            }

        }

    }
    public static int[] swap(int arr[], int j){

        int temp=arr[j];
        arr[j]= arr[j-1];
        arr[j-1]=temp;

        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {50,45,98,7,65};
        insertionsort ob = new insertionsort();
        ob.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
