public class decToBin {
    //convert from decimal to binary number
    public static void binary(int decNum){
        int power=0;
        int binNum=0;
        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(rem*(int)Math.pow(10, power));
            power++;
            decNum=decNum/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args) {
        binary(5);
    }
}
