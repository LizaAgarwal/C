public class sorting4 {
    //Merge Sort
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){//base condition
            return;
        }
        int mid=si+(ei-si)/2; //(si+ei)/2
        mergeSort(arr, si, mid);//left part of the array
        mergeSort(arr, mid+1, ei);//right part of the array
        merge(arr,si,mid,ei);//merge(left+right)
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];//temp array for storing the elements after being sorted merging left+right
        int i=si;//iterator for left part
        int j=mid+1;//iterator for right part
        int k=0;//iterator for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //in case some elements are left in left part to be stored in the temp arr
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //in case some elements are left in right part to be stored in the temp arr
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy elements of temp arr to original arr
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
