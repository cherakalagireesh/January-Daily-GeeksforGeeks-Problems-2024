//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int [] A = new int[N];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < N; i++)
				A[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			System.out.println(ob.equalSum(A, N));
		}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	int equalSum(int [] A, int N) {
		
		if(N < 2)
		    return 1;
		    
		int leftSum = 0;
		int rightSum = 0;
		
		for(int i = 1 ; i < N ; i++)
		{
		    rightSum += A[i];
		}
		
		for(int i = 0 ; i < N - 1 ; i++)
		{
		    leftSum += A[i];
		    rightSum -= A[i+1];
		    
		    if(leftSum == rightSum)
		        return i+2;
		}
		
		return -1;
	}
}