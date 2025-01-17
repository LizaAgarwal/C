public class DP21 {
    //Matrix Chain Multiplication(using recursion)
    public static int mcm(int arr[],int i,int j){
        if(i==j){//base case
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(arr, i, k);//cost of set1=Ai...Ak
            int cost2=mcm(arr, k+1, j);//cost of set2=Ak+1...Aj
            int cost3=arr[i-1]*arr[k]*arr[j];//cost of set1.set2
            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans, finalCost);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        System.out.println(mcm(arr,1,n-1));
    }
}
