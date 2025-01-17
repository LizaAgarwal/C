import java.util.ArrayList;

public class greedyAlgo {
    //Activity selection
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxAct=0;//initializing the count of maxm activity as 0
        ArrayList<Integer> ans=new ArrayList<>();//creating an arraylist for storing the final ans
        //adding the 1st activity to the ans arraylist
        maxAct=1;//updating count to 1
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("count of max activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
