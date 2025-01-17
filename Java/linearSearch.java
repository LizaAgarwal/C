public class linearSearch {
    //find the index of an element in a given array
    //linear search->jab hum ek ke baad ek(starting index se ending index)index par ja jakar us element ko search kar rahe honge
    public static int ind(int numbers[],int el){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==el){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int el=11;
        System.out.println(ind(numbers, el));
    }
}
//time complexity of linear search is O(n) because in worst case scenario where we couldn't find the element, we need to travel the array upto its last index,i.e,n times(n is the size of array)