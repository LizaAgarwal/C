import java.util.*;
public class hashMapQ2 {
    public static boolean isAnagram(String s,String t){
        //Ques: valid Anagram
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(hm.get(t.charAt(i))!=null){
                if(hm.get(t.charAt(i))==1){
                    hm.remove(t.charAt(i));
                }else{
                    hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty(); //if hm is empty: return true, else: return false
    }
    public static void main(String[] args) {
        String s="tulip";
        String t="lipid";
        System.out.println(isAnagram(s, t));
    }
}
