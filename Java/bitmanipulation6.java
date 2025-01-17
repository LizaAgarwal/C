public class bitmanipulation6 {
    //Clear last i bits,i.e, if n=1111 and i=2 then after clearing the last 2 bits from n the result is 1100
    public static int clearIBits(int n,int i){
        int bitMask=(~0)<<i;    //(-1)<<i since ~0=-1
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
    }
}
