public class Strings4 {
    public static void main(String args[]){
        String sentence="My name is Liza";
        //substring
        String name=sentence.substring(11,sentence.length()); //11 is starting index and sentence.length() is ending index which is exclusive
        System.out.println(name);
    }
}
