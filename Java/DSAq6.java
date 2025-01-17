public class DSAq6 {
    public static int maxLen(int arr[],int k){
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum%k==0){
                    maxLength=Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[]={2, 7, 6, 1, 4, 5};
        int k=3;
        System.out.println(maxLen(arr, k));
    }
}
