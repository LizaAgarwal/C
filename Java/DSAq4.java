import java.util.Arrays;

public class DSAq4 {
    //Given an unsorted array of size n. Array elements are in the range of 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.
    public static void repeatNMissing(int arr[]){
        Arrays.sort(arr);
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]-1]==0){
                temp[arr[i]-1]=1;
            }else{
               System.out.println(arr[i]);
            }
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]==0){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 3, 6, 2, 3,5};
        repeatNMissing(arr);
    }
}
