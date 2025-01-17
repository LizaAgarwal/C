public class recursion11 {
    //remove duplicates in a string
    public static void remDup(String str, int idx, StringBuilder newString, boolean map[]){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            remDup(str, idx+1, newString, map);
        }else{
            map[currChar-'a']=true;
            remDup(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String args[]){
        remDup("abbcdccdda", 0, new StringBuilder(""), new boolean[26]);
    }
}
