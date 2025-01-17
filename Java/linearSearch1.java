public class linearSearch1 {
    //find the largest number in an array
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={2,1,6,37,8};
        System.out.println(getLargest(numbers));
    }
}
