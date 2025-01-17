//Get Bit: gives the value/bit(0 or 1) at given position(i) in a number.
//Step1: Bit Mask: 1<<i
//Step2:Operation: AND(Bit Mask & number)
public class bitmanipulation {
    //Get the 3rd bit(position=2) of a number n=0101 (indexing starts from 0 from right)
    public static void main(String args[]){
        int n=5;
        int i=2;
        int bitMask=1<<i;
        if ((bitMask&n)==0){
            System.out.println("bit was 0");
        }else{
            System.out.println("bit was 1");
        }
    }
}
