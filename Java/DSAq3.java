import java.util.Arrays;

public class DSAq3 {
    //given an integer array where each value represents the number of chocolates in a packet.There are m students, the task is to distribute chocolate packets such that: 
    //# Each student gets one packet.
    //# The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
    public static int chocolateDistribute(int arr[],int m){
        //base cases
        if(arr.length<m||m==0){//if no. of packets of chocolates are less than no. of students || no. of students=0
            return -1;
        }
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for(int si=0;si<arr.length;si++){//si of subarray
            int ei=si+m-1;//ei of subarray
            if(ei>=arr.length){
                break;
            }
            min_diff=Math.min(min_diff, arr[ei]-arr[si]);
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        int m=5;
        System.out.println(chocolateDistribute(arr, m));
    }
}
