//Clear bit: it sets the bit to 0 at the given position in a number.
//Step1: Bit Mask:1<<i
//Step2: Operation: AND with NOT((~ Bit Mask) & number) 
public class bitmanipulation2 {
    //Clear the 3rd bit(position=2) of a number n=0101
    public static void main(String args[]){
        int n=5;
        int i=2;
        int bitMask=1<<i;
        int notBitMask= ~(bitMask);
        int newNumber=notBitMask & n;
        System.out.println(newNumber);
    }
}
