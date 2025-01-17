//Recursion: fuction that calls itself
//In recursion, whenever a function is called, it gets stored in the memory stack in the form of layers and each layer gets deleted when it is returned.
public class recursion {
    //print numbers from 5 to 1
    public static void printNum(int n){
        if (n==0){  //Base condition
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printNum(n);
    }
}

//Under the main function, printNum function is called and we pass n=5. Since the base condition is not true, then we go to the next code and print n and then again call printNum function and pass n-1(4). Again, the base condition is not true and we print 4 and call printNum function and pass n-1(3). When n=0 then base case is true and then we return.