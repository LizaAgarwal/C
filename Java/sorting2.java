//Insertion sort: In this sorting method, we will divide the array into sorted and unsorted array. At first, 1st element will be under sorted array and the remaining elements will be under unsorted array.
public class sorting2 {
    public static void printArray(int arr[]){
        for(int i=1;i<arr.length;i++){  //the outer loop will start from 1st element of unsorted array
            int current=arr[i];
            int j=i-1; //variable j is to first go to the last element, then second last and so on and at last the first element of the sorted array.
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current; //when current>arr[j]
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={7,9,2,6,1,4};
        printArray(arr);
    }
}

//time complexity: O(n^2) because 2 loops(i,while) are running
