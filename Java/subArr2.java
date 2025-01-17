public class subArr2 {
    //calculating Max Subarray sum using Kadane's algorithm
    public static void Kadane(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum+=numbers[i];
            if(currSum<0){
                currSum=0;//Acc to kadane's algo if the currSum becomes -ve then we assume it as 0
            }
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.println("max sum:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        Kadane(numbers);
    }
}
//time complexity is O(n) because a single loop runs upto the length of array
//kadane algo is the most optimized solution
//in case where all the elements in an array are negative, maxsum will be smallest -ve number in that array
