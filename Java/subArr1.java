public class subArr1 {
    //calculating Max Subarray sum using prefix array
    public static void printMaxSum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int preArray[]=new int[numbers.length];
        preArray[0]=numbers[0];
        //creating a prefix array
        for(int i=1;i<numbers.length;i++){
            preArray[i]=numbers[i]+preArray[i-1];//|2|6|12|20|30|
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=i==0?preArray[j]:preArray[j]-preArray[i-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printMaxSum(numbers);
    }
}
//here time complexity is O(n^2) because 2 loops(i,j) are running upto the length of array
//thus prefix array is an optimize soln for this problem