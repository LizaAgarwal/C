import java.util.*;
public class Stack11 {
    //Max area in histogram
    public static int maxAreaInHistogram(int heights[]){
        Stack<Integer> s=new Stack<>();
        //next smaller right
        int nsr[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        int nsl[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //calculate max area
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int length=heights[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=length*width;
            maxArea=Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(maxAreaInHistogram(heights));
    }
}
