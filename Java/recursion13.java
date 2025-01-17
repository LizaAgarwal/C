import java.util.HashSet;
public class recursion13 {
    //print all the unique subsequences of a string
    public static void subsequence(String str, int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //if curr character wants to be in the subsequence
        subsequence(str, idx+1, newString+currChar,set);
        //if curr character does not want to be in the subsequence
        subsequence(str, idx+1, newString,set);
    }
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        subsequence("aaa", 0, "",set);
    }
}
