import java.util.Stack;
public class Stack5 {
    //reverse a string using stack
    public static String reverseStr(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newStr=new StringBuilder("");
        while(!s.isEmpty()){
            newStr.append(s.pop());
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverseStr(str));
    }
}
