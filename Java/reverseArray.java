public class reverseArray {
    public static void main(String args[]){
        int arr[]={1,3,5,7,9};
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[arr.length-1-i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
