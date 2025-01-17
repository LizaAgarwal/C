public class array4 {
    //reverse an array
    public static void revArr(int numbers[]){
        int start=0, end=numbers.length-1;
        while (start<end) {
            //swap
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,4,35,6,54};
        revArr(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
//here space complexity is O(1) because we didn't need to create a new array for reversing the old array, we just kept swapping the last and first element until we reached mid element.
//time complexity is O(n)
