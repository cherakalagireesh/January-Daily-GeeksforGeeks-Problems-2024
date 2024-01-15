//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        Arrays.sort(A1);
        LinkedHashSet<Integer> uniqueValues = new LinkedHashSet<>();
        int[] result = new int[N];
        int index = 0;
        
        for(int num:A2)
            uniqueValues.add(num);
            
        for(int num1:uniqueValues)
        {
            int count = 0;
            
            for(int num2:A1)
            {
                if(num1 == num2 )
                    count++;
            }
            
            while(count>0)
            {
                result[index++] = num1;
                count--;
            }
        }
        
        ArrayList<Integer> remainingValues = new ArrayList<>();
        
        for(int num:A1)
        {
            if(!uniqueValues.contains(num)) 
                remainingValues.add(num);
                
        }
        
        Collections.sort(remainingValues);
        
        for(int num:remainingValues)
        {
            result[index++] = num;
        }
        
        
        return result;
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends