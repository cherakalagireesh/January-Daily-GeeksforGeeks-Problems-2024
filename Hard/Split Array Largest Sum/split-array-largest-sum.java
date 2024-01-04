//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        
        long temp[] = findValues(arr);
        long low = temp[0];
        long high = temp[1];
        
        while(low <= high)
        {
            long mid = (low + high) / 2;
            
            if(countSubArrays(arr, mid) > K)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return (int)(low);
        
    }
    
    public static long[] findValues(int arr[])
    {
        int max = arr[0];
        long sum = 0;
        
        for(int num:arr)
        {
            max = Math.max(max,num);
            sum += num;
        }
        
        return new long[]{max, sum};
    }
    
    public static int countSubArrays(int []nums, long mid)
    {
        int partitionCount = 1;
        long currSum = 0;
        int length = nums.length;
        
        for(int i = 0 ; i < length ; i++)
        {
            if(currSum + nums[i] <= mid)
                currSum += nums[i];
            else
            {
                partitionCount++;
                currSum = nums[i];
            }
        }
        
        return partitionCount;
        
    }
};