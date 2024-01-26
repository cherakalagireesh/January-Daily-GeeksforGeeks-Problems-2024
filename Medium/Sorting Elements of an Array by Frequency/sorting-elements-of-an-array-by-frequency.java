/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		
		while(testCases > 0)
		{
		    int n = scanner.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i = 0 ; i < n ; i++)
		        arr[i] = scanner.nextInt();
		  
		    Map<Integer, Integer> freq = new HashMap<>();
		    ArrayList<Integer> buckets[] = new ArrayList[n + 1];
		    
		    for(int num : arr)
		        freq.put(num, freq.getOrDefault(num, 0) + 1);
		       
		    for(int key : freq.keySet())
		    {
		        int frequency = freq.get(key);
		        
		        if(buckets[frequency] == null)
		            buckets[frequency] = new ArrayList<>();
		          
		        buckets[frequency].add(key);
		    }
		    
		    for(int i = n ; i >= 0 ; i--)
		    {
		        ArrayList<Integer> bucket = buckets[i];
		        
		        if(bucket != null)
		        {
		            Collections.sort(bucket);
		        
		            for(int num : buckets[i])
		            {
    		            int len = i;
		                
		                while(len > 0)
		                {
		                    System.out.print(num + " ");
		                    
		                    len--;
		                }
		                
		            }   
		        }
		        
		    }
		    
		    System.out.println();
		    
		    testCases--;
		}
	}
}