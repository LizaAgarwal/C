import java.util.Arrays;

public class DSAq1 {
    //find the sum of min and max el in an array
    public static int findSum(int arr[],int n){
        Arrays.sort(arr);
        return arr[0]+arr[n-1];
    }
    public static void main(String[] args) {
        int arr[]={3, 5, 4, 1, 9};
        System.out.println(findSum(arr, arr.length));
    }
}
