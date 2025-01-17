import java.util.ArrayList;

public class Stack1 {
    //implementing stack using arraylist
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){//pop is of type int kyuki data ko delete karne se pehle hum usko store kar lete hai aur phir return kar dete hai
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);//top=last element of an arraylist
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);//return top element
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){//jab tak stack khali nhi ho jaata
            System.out.println(s.peek());//top element ko print karwaayenge
            s.pop();//phir usko remove kar denge
        }
    }
}
