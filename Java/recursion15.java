public class recursion15 {
    //check if an array is sorted(Strictly increasing)
    public static Boolean checkSort(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkSort(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3};
        System.out.println(checkSort(arr, 0));
    }
}
