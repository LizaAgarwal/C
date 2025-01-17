import java.util.ArrayList;

public class arraylist5 {
    //container with most water(optimized code)
    //2 pointer approach
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //calculate water area
            int length=Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int area=length*width;
            maxWater=Math.max(maxWater, area);
            //update pointers
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
