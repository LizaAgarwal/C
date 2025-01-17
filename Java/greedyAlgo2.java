import java.util.Arrays;
import java.util.Comparator;

public class greedyAlgo2 {
    //Fractional knapsack
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;//index
            ratio[i][1]=val[i]/(double)weight[i];//ratios of each item
        }
        //using the inbuilt sort method to sort the ratios of each item in ascending order 
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int maxVal=0;
        for(int i=ratio.length-1;i>=0;i--){//decsending order
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                maxVal+=val[idx];
                capacity-=weight[idx];
            }else{
                maxVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("max total value is:"+ maxVal);
    }
}
