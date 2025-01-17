public class conditional4 {
    public static void main(String args[]){
        //print the largest of 3 numbers
        int A=11, B=12, C=15;
        if((A>=B) && (A>=C)){
            System.out.println(A);
        }else if(B>=C){
            System.out.println(B);
        }else{
            System.out.println(C);
        }
    }
}