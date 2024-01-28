//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
       
       int length = str.length();
       int result = 0;
       int currVal = 0;
       int index = length - 1;
       Map<Character, Integer> map = new HashMap<>();
       
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       
       while(index >= 0)
       {
            int num  = map.get(str.charAt(index));
            currVal = num;
            
            while(index - 1 >= 0 && map.get(str.charAt(index - 1)) < num)
            {
                currVal -= map.get(str.charAt(index - 1));
                index--;
            }
            
            result += currVal;
            index--;
       }
       
       return result;
       
    }
}