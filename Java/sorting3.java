public class sorting3 {
    //Counting sort
    public static void countSort(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxValue=Math.max(maxValue, arr[i]);
        }
        int count[]=new int[maxValue+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countSort(arr);
    }
}
//time complexity:O(n+maxValue) which is equivalent to O(n)
