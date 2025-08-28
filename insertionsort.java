public class insertionsort {
    void sort(int [] arr  ){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
             arr[j+1]=key;
        }

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
