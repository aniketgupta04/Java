import java.util.Arrays;

public class matarray{
    public static void main(String[] args){
        int[][]mat={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int target=29;
        System.out.println("Program started");

        System.out.println(Arrays.toString(search(mat,target)));


    }

    static int[] search(int[][]mat,int target){
        int r=0;
        int c=mat[0].length-1;
        while(r<mat.length&&c>=0){
            if(mat[r][c]==target){
                return new int[]{r,c};
            }
            if(mat[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}