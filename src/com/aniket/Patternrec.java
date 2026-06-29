package com.aniket;

import java.util.Scanner;

public class Patternrec {

    public static void patt(int row, int c){
        if(row==0){
            return;
        }
        if(c<row) {
           
             patt(row, c + 1);
 System.out.print("*");
        }
        else{
           
            patt(row-1,0);
             System.out.println("");
        }

    }
    public static void main(String args[]){
       patt(4,0);

    }
}
