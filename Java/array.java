//Arrays: list of items of same datatype.
//Defining an array: type arrayname[]= new type[size];
public class array {
    public static void main(String[] args){
        //printing the marks of three subjects
        int marks[]=new int[3];
        marks[0]=94;
        marks[1]=90;
        marks[2]=97;
        for (int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}

//defining an array in another way: int marks[]={94,90,97};
