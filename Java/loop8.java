public class loop8 {
    public static void main(String args[]){
        //print the reverse of a number
        int n=10899;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit);
            n=n/10;
        }
    }
}
