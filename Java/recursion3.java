public class recursion3 {
    //print factorial of number n
    public static int printFact(int n){ 
        if (n==0){
            return 1;
        }
        int fact_1=printFact(n-1);
        int fact=n*fact_1;
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        int ans=printFact(n);
        System.out.println(ans);
    }
}

//Under main function, we call printFact function and pass n=5. Since base condition is not true, we go to the next code and then again call printFact function and pass n-1(4).Again the base case is not true and we call printFact and pass n-1(3).When we pass inside printfact, base case is true and it returns 1. Then 1 gets multiplied with 2 and the resultant(2) is stored in variable fact and then returned. Then 2(resultant) gets multiplied with 3 and 6 is returned.Similarly, when it reaches n=5 and the resultant is 120 then it is returned and gets printed.
