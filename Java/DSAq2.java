import java.util.ArrayList;
import java.util.Arrays;

public class DSAq2 {
    //Given an integer array, return true if duplicate value appears, and false if doesn't.
    public static boolean containsDuplicate(int nums[]){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            if(temp.contains(curr)){
                return true;
            }else{
                temp.add(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1};
        System.out.println(containsDuplicate(nums));
    }
}
