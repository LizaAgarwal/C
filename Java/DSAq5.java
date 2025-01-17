import java.util.ArrayList;
import java.util.Arrays;

public class DSAq5 {
    //Given an integer array nums and an integer k, return the kth largest element in the array.
    public static int kthLargest(int arr[],int k){
        return arr[arr.length-k];
    }
    //for kth smallest element
    public static int kthSmallest(int arr[],int k){
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        Arrays.sort(arr);
        System.out.println(kthLargest(arr, k));
        System.out.println(kthSmallest(arr, k));
    }
}
