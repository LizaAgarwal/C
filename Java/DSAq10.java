public class DSAq10 {
    //Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.
    public static String removeConsecutiveCharacter(String S){
       StringBuilder sb=new StringBuilder("");
       sb.append(S.charAt(0));
       for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=sb.charAt(sb.length()-1)){
                sb.append(S.charAt(i));
            }
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String s="aabb";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
