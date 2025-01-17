public class DSAq7 {
    public static void poosibleSubArr(int arr[],int r){
        for(int si=0;si<arr.length;si++){
            int ei=r-si-1;
            if(ei>=arr.length){
                break;
            }
            for(int i=si;i<=ei;i++){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int r=2;
    }
}
