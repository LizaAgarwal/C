import java.util.Stack;
public class Stack10 {
    //duplicate parentheses
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr==')'){//incase of closing parentheses
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){  
                    return true;//duplicate exists
                }else{
                    s.pop();
                }
            }else{//incase of opening parentheses-'(' or operands-a,b,c,... or operators-+,-.*,...
                s.push(curr);
            }
        }
        return false;//duplicate doesn't exist
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d))";//valid parentheses
        System.out.println(isDuplicate(str));
    }
}
