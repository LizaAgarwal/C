import java.util.*;

public class hashMapQ5 {
    public static void main(String[] args) {
        //find the count of subarrays whose sum equal to k
        int arr[]={1,2,3};
        int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        int sum=0;
        int count=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(count);
    }
}
