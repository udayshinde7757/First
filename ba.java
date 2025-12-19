import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ba {

    int gcd1(int a,int b){
        while(a>0&&b>0){
            if(a<b){
                b=b%a;
            }else{
                a=a%b;
            }
        }
        if(a==0)return b;
        return a;
    }

    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    void reversed(int arr[],int a){
        if((arr.length/2)<=a)return;
        int temp=arr[a];
        arr[a]=arr[arr.length-a-1];
        arr[arr.length-a-1]=temp;
        reversed(arr, a+1);
    }

    int isSorted(int arr[],int a){
        if(a==arr.length-1)return 1;
        if(arr[a]>arr[a+1])return 0;
        return isSorted(arr, a+1);
    }
    
    public int nthRoot(int n, int m) {
        int start=1,end=m;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((int)Math.pow(mid,n)==m)return mid;
            else if(Math.pow(mid,n)>m)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

   public boolean wordBreak(String s, List<String> wordDict) {
    Set<String> set = new HashSet<>(wordDict);
    boolean[] dp = new boolean[s.length() + 1];
    dp[0] = true;

    for (int i = 1; i <= s.length(); i++) {
        for (int j = 0; j < i; j++) {
            if (dp[j] && set.contains(s.substring(j, i))) {
                dp[i] = true;
                break;
            }
        }
    }
    return dp[s.length()];
}

    ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        list.add(arr[n-1]);
        return list;
        //16,17,4,3,5,2
        //17,5,2
    }

    public static void main(String[] args) {
        // System.out.println(new b().isSorted(new int[]{1,2,3,4,5,6},0));
        // int arr[]={1,2,3,4,5,6};
        // new b().reversed(arr,0);
        // System.out.println("Reversed"+Arrays.toString(arr));
        // System.out.println("GCD: "+new b().gcd1(18,18));
        // System.out.println(new ba().nthRoot(1,2));
        // System.out.println(new ba().wordBreak("aaaaaaa", List.of("aaaa","aaa")));
        System.out.println(new ba().leaders(new int[]{16,17,4,3,5,2}));
    }
}