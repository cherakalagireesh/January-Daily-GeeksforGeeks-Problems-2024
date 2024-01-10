//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    StringBuilder sb= new StringBuilder();
	    
	    while(n!=0){
	        sb.append((char)((n%2)+'0'));
	        n=n>>1;
	    }
	    
	    if(sb.length()%2!=0)
	    sb.append("0");
	    sb.reverse();
	   
	    for(int i=0;i<sb.length()-1;){
	        char temp= sb.charAt(i);
	        sb.setCharAt(i,sb.charAt(i+1));
	        sb.setCharAt(i+1,temp);
	        i=i+2;
	    }
	    
	    int res=Integer.parseInt(sb.toString(),2);
	    
	    return res;
    }
    
}

//{ Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}
// } Driver Code Ends