public class sorting6 {
    //rotated sorted array
    public static int targetIdx(int arr[],int target,int si, int ei){
        if(si>ei){
            return -1;//in case target element is not present in the array
        }
        int mid=si+(ei-si)/2;//(si+ei)/2
        if(arr[mid]==target){
            return mid;
        }
        //Case 1: mid is on L1
        if(arr[mid]>=arr[si]){
            //case a:target is on left of L1
            if(arr[si]<=target && target<=arr[mid]){
                return targetIdx(arr,target,si,mid-1);
            }else{
                //case b:target is on right of mid
                return targetIdx(arr, target, mid+1, ei);
            }
        //Case 2: mid is on L2
        }else{
            //case c:target is on right of L2
            if(target>=arr[mid] && target<=arr[ei]){
                return targetIdx(arr, target, mid+1, ei);
            }else{
                //case d:target is on left of mid
                return targetIdx(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(targetIdx(arr,target,0,arr.length-1));
    }
}
