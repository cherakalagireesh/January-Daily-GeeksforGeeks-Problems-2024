//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        
        int length = s.length();
        int count = 0;
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < length ; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
                count++;
            else
                count--;
            
            if(count != 0 && (count != 1 || (count == 1 && ch != '(')) )
                result.append(ch);
        }
        
        return result.toString();
    }
}
