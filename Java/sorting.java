//Bubble sort: In this sorting method, in the 1st iteration, we will compare a pair of two elements and swap the elements in case the first element is larger than the element next to it and this will continue for n-1 times. Similarly in 2nd iteration, same process of comparison will go on for n-2 times.
public class sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){    //in the outer loop, bubble sort will work for n-1 times where n is the total no of element in array because if (n-1) elements are sorted then nth element will already be sorted.Here i is for no. of turns
            for(int j=0;j<arr.length-i-1;j++){  //in the inner loop, comparison and swapping method will work for (n-i-1) times because the element which got sorted, will not be included for comparison.
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        printArray(arr);
    }
}

//time complexity= O(n^2) because 2 loops(i,j) are running here