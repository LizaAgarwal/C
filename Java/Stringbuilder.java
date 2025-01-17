//Since strings in java are immutable, therefore String builder was intoduced.
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Liza"); //sb is a string of type stringbuilder
        System.out.println(sb);
        // printing the charAt index 0
        System.out.println(sb.charAt(1));
        //replace charAt index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //insert charAt index 2
        sb.insert(2,'z');
        System.out.println(sb);
        //delete all the z from "Pizza"
        sb.delete(2,4);
        System.out.println(sb);
    }
}
