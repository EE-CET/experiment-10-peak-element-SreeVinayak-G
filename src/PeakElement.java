import java.util.*;
public class PeakElement {

        public static int findPeak(int[] arr,int n){
                int ans = -1;
                if(n==1) return 0;
                if(arr[0]>arr[1]) return 0;
                for(int i=1;i<n-1;i++){
                        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                                ans = i;
                                break;
                        }
                }
                if(ans==-1 && arr[n-1]>arr[n-2]) return n-1;
                else return ans;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
                int idx = findPeak(arr,n);
                System.out.println(idx);
        }

}
