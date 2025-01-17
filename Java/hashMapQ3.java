import java.util.*;;

public class hashMapQ3 {
    //find itinerary(journey/path) for tickets
    public static String start(HashMap<String,String> tickets){
        HashMap<String,String> revTickets=new HashMap<>();
        for(String key: tickets.keySet()){
            revTickets.put(tickets.get(key), key);
        }
        for(String key: tickets.keySet()){
            if(!revTickets.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String startPoint=start(tickets);
        System.out.print(startPoint);
        for(String key:tickets.keySet()){
            System.out.print("->"+tickets.get(startPoint));
            startPoint=tickets.get(startPoint);
        }
        System.out.println();
    }
}
