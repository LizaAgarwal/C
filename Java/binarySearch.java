public class binarySearch {
    //find the index of an element in array
    public static int ind(int numbers[],int el){
        int start=0, end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==el){
                return mid;
            }
            if(numbers[mid]>el){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,9};
        int el=4;
        System.out.println(ind(numbers, el));
    }
}
