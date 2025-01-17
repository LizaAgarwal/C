public class backtracking1 {
    //backtracking on arrays
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int arr[],int i,int val){
        if(i==arr.length){//base case
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;//backtracking step
    }
    public static void main(String[] args) {
        int arr[]=new int[5];//an empty array of size 5
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
