//Selection sort: in this sorting method, there is only one swap per iteration
public class sorting1 {
    public static void printArray( int arr[]){
        for(int i=0;i<arr.length-1;i++){  //selction sort will work for n-1 times.Here i is no. of turns
            int smallest=i; //we will assume first element of the array as the smallest
            for(int j=i+1;j<arr.length;j++){    //start comparing the first element with the 2nd element then 3rd and so on and in case any element is smaller than 1st element then we will assign that element as the samllest and at last when 1st loop is completed then swap the smallest element with the element stored in variable smallest. 
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
    public static void main(String args[]){
        int arr[]={9,3,6,1,5};
        printArray(arr);
    }
}

//time complexity= O(n^2)
