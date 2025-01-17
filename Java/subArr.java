public class subArr {
    //print all the subarrays of an array
    //subarrays:a continuous part of array
    public static void printSubArr(int numbers[]){
        int ts=0;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;//-infinity
        int minSum=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){//this loop is for starting index
            for(int j=i;j<numbers.length;j++){//this loop is for ending index
                currSum=0;
                for(int k=i;k<=j;k++){//this loop is for printing all the elements between starting and ending index
                    System.out.print(numbers[k]+" ");
                    currSum+=numbers[k];
                }
                ts++;
                System.out.println();
                System.out.println("sum="+currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                if(currSum<minSum){
                    minSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("total subarrays:"+ts);
        System.out.println("maximum sum:"+maxSum);
        System.out.println("Min sum:"+minSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubArr(numbers);
    }
}
//here time complexity of calculating max sum of all subarrays is O(n^3) because 3 loops(i,j,k) run upto the length of array
