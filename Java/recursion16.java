public class recursion16 {
    //print all the permutations of the given string
    public static void printPermu(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);    //for i=0, currChar will store 'a'
            String newString=str.substring(0, i)+str.substring(i+1);    //and newString will store "bc"
            printPermu(newString, permutation+currChar);
        }
    }
    public static void main(String args[]){
        printPermu("abc", "");
    }
}
