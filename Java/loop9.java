public class loop9 {
    public static void main(String args[]){
        //store the reverse of a number in a variable and print that variable
        int n=7238448;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
