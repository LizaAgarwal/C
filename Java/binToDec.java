public class binToDec {
    //convert from binary to decimal number
    public static void decimal(int binNum){
        int decNum=0;
        int power=0;
        while (binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2, power)); // since, Math.pow takes double as arguments, we need to typecast it to int
            power++;
            binNum=binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        decimal(1000);
    }
}
