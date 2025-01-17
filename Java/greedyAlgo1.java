import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class greedyAlgo1 {
    //Activity Selection-where end time is not sorted
    public static void main(String[] args) {
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        //sorting end time
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;//index
            activities[i][1]=start[i];//start
            activities[i][2]=end[i];//end
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));//using the inbuilt sort method to sort 2nd col(end time)

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //adding 1st acitivity 
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("count of max activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
