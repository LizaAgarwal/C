import java.util.*;
public class hashSet1 {
    public static void main(String[] args) {
        //Iteration on hashSet
        HashSet<String> cities=new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bombay");
        cities.add("Noida");
        //using iterators
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //using enhanced for loop
        for(String city:cities){
            System.out.println(city);
        }
    }
}
