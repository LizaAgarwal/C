import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm=new HashMap<>();
        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm); //unordered insertion

        //Get
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia")); //invalid key, output: null

        //containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //is Empty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);
    }
}

