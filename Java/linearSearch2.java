public class linearSearch2 {
    //find the smallest number in an array
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={2,1,6,37,8};
        System.out.println(getSmallest(numbers));
    }
}
