//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.awt.Point; 
import java.util.Arrays; 
import java.util.Vector; 
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		findAll();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Arrays.sort(arr);
		    boolean flag=false;
		    for(int x:arr)
		    {
		        if(mp.containsKey(x))
		        {System.out.print(x+" ");flag=true;}
		    }
		    
		    if(flag==false)
		    System.out.print(-1);
		    System.out.println();
		}
		
		
	}
	
	
    static HashMap<Integer,Integer>mp=new HashMap<>();



// } Driver Code Ends
//User function Template for Java

//Function to find all the numbers with only 1,2 and 3 in their digits.
// static HashMap<Integer,Integer>mp=new HashMap<>();
public static void findAll()
{
      for(int i=1; i<=1000000; i++){
        if(isTrue(i)) mp.put(i,1);
    }
    
}
public static boolean isTrue(int a){
    int c=a;
    while(c>0){
        if(c%10 == 1 || c%10 == 2 || c%10 == 3){
            c/=10;
        }else{
            return false;
        }
    }
    return true;
}
  
      




//{ Driver Code Starts.


}
// } Driver Code Ends