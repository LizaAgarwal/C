public class DSAq9 {
    //Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point, the task is to check if the array has a pair with a given sum X.
    public static boolean sumExists(int arr[],int X){
        int n=arr.length;
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int lp=i;
        int rp=i+1;
        while(lp!=rp){
            if(arr[lp]+arr[rp]==X){
                return true;
            }
            if(arr[lp]+arr[rp]>X){
                lp=(n+lp-1)%n;
            }else{
                rp=(rp+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={11, 15, 26, 38, 9, 10};
        System.out.println(sumExists(arr, 45));
    }
}
