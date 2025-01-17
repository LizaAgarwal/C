//Set Bit: it sets the bit to 1 at the given position in a number.
//Step1: Bit Mask:1<<i
//Step2: Operation: OR(Bit Mask OR number)
public class bitmanipulation1 {
    //Set the 2nd bit(position=1) of a number n=0101
    public static void main(String args[]){
        int n=5;
        int i=1;
        int bitMask=1<<i;
        int newNumber=bitMask|n;
        System.out.println(newNumber);
    }
}
