public class sorting5 {
    //Quick Sort
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){//base condition
            return;
        }
        int pivotiIdx=partition(arr,si,ei);
        quickSort(arr, si, pivotiIdx-1);//left part
        quickSort(arr, pivotiIdx+1, ei);//right part
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];//last element
        int i=si-1;//to make place for the elements smaller than pivot
        for(int j=si;j<ei;j++){//this for loop is to place the elements<pivot in the left part
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //Now, we will place the pivot at its correct position,i.e, after the smaller elements
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
