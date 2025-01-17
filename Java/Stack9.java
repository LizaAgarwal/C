import java.util.*;
public class Stack9 {
    //valid parentheses
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='(' || curr=='{' || curr=='['){//incase of opening braces
                s.push(curr);
            }else{//incase of closing braces
                if(s.isEmpty()){//strings like ")))" or "}([])"
                    return false;
                }else{
                    if((s.peek()=='(' && curr==')') || (s.peek()=='{' && curr=='}') || (s.peek()=='[' && curr==']')){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="[{()}]}";
        System.out.println(isValid(str));
    }
}
