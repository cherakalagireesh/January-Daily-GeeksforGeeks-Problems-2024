//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        int upperCount = 0;
        int lowerCount = 0;
        int result = 0;
        int length = S.length();
        
        for(int i = 0 ; i < length ; i++)
        {
            for(int j = i ; j < length ; j++)
            {
                char ch = S.charAt(j);
                
                if(ch >= 'a' && ch <= 'z')
                    lowerCount++;
                if(ch >= 'A' && ch <= 'Z')
                    upperCount++;
                    
                if(lowerCount == upperCount)
                    result++;
            }
            
            lowerCount = 0;
            upperCount = 0;
        }
        
        return result;
    }
} 
