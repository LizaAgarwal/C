public class recursion12 {
    //print all the subsequences of a string
    public static void subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //if curr character wants to be in the subsequence
        subsequences(str, idx+1, newString+currChar);
        //if curr character does not want to be in the subsequence
        subsequences(str, idx+1, newString);
    } 
    public static void main(String args[]){
        subsequences("abc", 0, "");
    }
}
