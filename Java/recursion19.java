public class recursion19 {
    //find the no of ways in which you can invite n people to your party, single or in pairs
    public static int callGuests(int n){
        if(n<=1){
            return 1; // if there is only one or less than one guest then there is only one way of calling them
        }
        //single
        int single=callGuests(n-1);
        //in pairs
        int pair=(n-1)*callGuests(n-2); //any of the one guests(out of n) will choose his partner in (n-1) ways* no of guets left are (n-2)
        return single+pair;
    }
    public static void main(String args[]){
        int ans=callGuests(4);
        System.out.println(ans);
    }
}
