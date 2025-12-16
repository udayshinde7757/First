public class b {

    int isSorted(int arr[],int a){
        if(a==arr.length-1)return 1;
        if(arr[a]>arr[a+1])return 0;
        return isSorted(arr, a+1);
    }
    public static void main(String[] args) {
        System.out.println(new b().isSorted(new int[]{1,2,3,4,5,6},0));
    }
}