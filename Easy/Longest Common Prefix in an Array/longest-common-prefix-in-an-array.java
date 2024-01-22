//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        
        if(n == 0)  
            return "";
            
        int low = 0;
        int high = Integer.MAX_VALUE;
        
        for(String str : arr)
            high = Math.min(high, str.length() - 1);
            
            
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(compareStrings(arr, mid))
                low = mid + 1;
            else
                high = mid - 1;
                
        }
        
        return high >= 0 ? arr[0].substring(0, high + 1) : "-1";
    }
    
    Boolean compareStrings(String strs[], int mid)
    {
        if(strs[0].length() < mid)
            return false;
        
        String prefix = strs[0].substring(0, mid + 1);
        
        for(String str : strs)
            if(!str.startsWith(prefix)) 
                return false;
                
        return true;
    }
}