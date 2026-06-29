import java.util.*;
class Main {
    public static boolean check(int[] nums) {
        int[] sort=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
        System.out.println(Arrays.toString(nums));
        boolean issort=true;
        for(int r=0;r<=nums.length;r++){
            issort=true;
            for(int i=0;i<nums.length;i++){

                if(sort[i]!=nums[i+r%nums.length]){
                    issort=false;
                    break;

                }
                else{
                    continue;
                }
            }
            if(issort=true){
                break;
            }
        }
        if(issort==true){
            return true;
        }
        else{
            return false;
        }

    }
    public static int[] input() {
        return new int[]{2,1,3,4};
    }

    public static void main(String[] args) {
        int[] nums = input();
        System.out.println(check(nums));
    }
}