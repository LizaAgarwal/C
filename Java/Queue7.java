import java.util.*;
public class Queue7 {
    //print first non-repeating letter in a stream of characters
    public static void printNonRepeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            q.add(curr);
            freq[curr-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);
    }
}
