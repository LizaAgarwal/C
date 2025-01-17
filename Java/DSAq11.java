public class DSAq11 {
    //Print all the duplicate characters in a string
    public static void repeatedChars(String str){
        int temp[]=new int[26];
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            temp[curr-'a']++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]>1){
                System.out.print((char)(i+'a')+",count="+temp[i]);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        String str="greeksforgreeks";
        repeatedChars(str);
    }
}
