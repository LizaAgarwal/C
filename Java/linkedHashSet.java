import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        //order of insertion is maintained
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bengaluru");
        lhs.add("Noida");
        lhs.add("Mumbai");
        System.out.println(lhs);
        lhs.remove("Noida");
        System.out.println(lhs);
    }
}
