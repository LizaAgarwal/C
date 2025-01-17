public class DSAq8 {
    //Minimum element in a sorted and rotated array
    public static int minEl(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                return arr[(i+1)%n];
            }
        }
        return -1;//incase min el not found
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        System.out.println(minEl(arr));
    }
}
