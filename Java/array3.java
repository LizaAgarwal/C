public class array3 {
    //Passing arrays as function arguments(arrays->call by reference: any change in function will reflect in the main function also)
    public static void update(int marks[],int num){
        num+=1;
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        int marks[]={99,95,96};
        int num=5;//num-> call by value
        update(marks,num);
        System.out.println(num);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
