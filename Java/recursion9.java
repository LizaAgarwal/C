public class recursion9 {
    //print the 1st and last occurence of an element in string
    public static int first=-1;
    public static int last=-1;//initializing two variable first and second as -1
    public static void printOcc(String str, char element, int idx){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        printOcc(str, element, idx+1);
    }
    public static void main(String args[]){
        printOcc("abaacdaefaah",'a',0);
    }
}
//time complexity: O(n) 
