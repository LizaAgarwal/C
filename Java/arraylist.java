import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[]){
        //ArrayList: variable size data structure
        ArrayList<Integer> list=new ArrayList<>();
        //Operations on arraylist
        //add elements
        list.add(0);
        list.add(1);
        list.add(5);
        System.out.println(list);

        //get elements
        int el=list.get(2);//here 2 is the index
        System.out.println(el);

        //add el in between
        list.add(1,6);//add(index,el to add)
        System.out.println(list);

        //set element- it replaces the original element with new element
        list.set(2,4);//set(index,new el to add)
        System.out.println(list);

        //delete element
        list.remove(0);//remove(index)
        System.out.println(list);

        //contains element
        System.out.println(list.contains(4));//contains(el)
        System.out.println(list.contains(0));

        //size of list
        System.out.println(list.size());

        //iterate over list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);//ascending
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());//descending
        System.out.println(list);
    }
}
