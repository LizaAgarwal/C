//Tower of Hanoi
//Rule 1:only one disk can be transferred in 1 step
//Smaller disks are always kept on top of larger disks.
//Consider a 3 towers- 1. Source tower: where all the disks are kept initially.
//                     2. Destination tower: where all the disks have to be kept finally.
//                     3. Helper tower: which can be used for keeping the disks in between
public class recursion7 {
    //print the steps for transferring n disks from source to destination tower
    public static void towerOfHanoi(int n, String src, String help,String dest){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        towerOfHanoi(n-1, src,dest,help);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String args[]){
        towerOfHanoi(3, "S", "H", "D");
    }
}
