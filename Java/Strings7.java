public class Strings7 {
    public static void main(String[] args) {
        //compare two strings
        String s1="tony";
        String s2=new String("tony");
        if(s1.equals(s2)){  //.equals() function compares the content of the strings.If we would have written s1==s2,output would be "not equal"
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
