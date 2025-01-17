public class bitmanipulation4 {
    //check if a number is odd or even
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(11);
        oddOrEven(6);
    }
}
