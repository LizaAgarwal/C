public class recursion14 {
    //print keypad combination
    public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void combination(String str, int idx, String newString){
        if (idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            combination(str, idx+1, newString+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        combination("23", 0, "");
    }
}
