public class Strings3 {
    public static void main(String args[]){
        //compare
        String name1="luz";
        String name2="liza";//since 'i' in "liza" is smaller than 'u' in "luz", therefore name1 is greater 
        //s1>s2: +ve value
        //s1==s2: 0
        //s1<s2: -ve value
        System.out.println(name1.compareTo(name2));
        if (name1.compareTo(name2)>0){
            System.out.println("name1 is greater");
        }else if(name1.compareTo(name2)<0){
            System.out.println("name2 is greater");
        }else{
            System.out.println("name1 is equal to name2");
        }
    }
}
