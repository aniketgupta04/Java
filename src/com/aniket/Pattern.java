package src.com.aniket;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern {

    public static void patt(int row, int c){
        if(row==0){
            return;
        }
        if(c<row) {
            System.out.println("*");
             patt(row, c + 1);
        }
        else{
            patt(row-1,0);
        }

    }
    public static void bubble(int[] arr, int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp =arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }
    public static void select(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[max]){
                select(arr,r,c+1,c);

            }
            else{

                select(arr,r,c+1,max);
            }

        }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            select(arr,r-1,0,0);
        }
    }
    public static void main(String args[]){

       int arr[]={2,6,10,1};

       select(arr,arr.length,0,0);
       System.out.println(Arrays.toString(arr));

    }
}
