//Update bit: it updates the bit at a given position and either sets it to 0 or 1 as per said.
//If we have to set the bit to 0 then we use clear bit operation
//If we have to set the bit to 1 then we use set bit operation
import java.util.Scanner;
public class bitmanipulation3 {
    //Update the 2nd bit(position=1) of a number n=0101 to 1
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int upd=sc.nextInt();
        int n=5;
        int i=1;
        int bitMask=1<<i;
        if (upd==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        }else{
            int notBitMask=~(bitMask);
            int newNumber=notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
