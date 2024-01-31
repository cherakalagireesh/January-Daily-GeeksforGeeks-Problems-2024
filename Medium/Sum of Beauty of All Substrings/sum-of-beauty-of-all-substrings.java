//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        
        int length = s.length();
        int result = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < length ; i++)
        {
            int freq[] = new int[26];
            
            for(int j = i ; j < length ; j++)
            {
                freq[s.charAt(j) - 'a']++;
                
                for(int num : freq)
                {
                    if(num != 0)
                    {
                        maxValue = Math.max(maxValue, num);
                        minValue = Math.min(minValue, num);
                    }
                }
                
                result += maxValue - minValue;
                maxValue = Integer.MIN_VALUE;
                minValue = Integer.MAX_VALUE;
            }
            
        }
        
        return result;
    }
}
        
