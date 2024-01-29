//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	    
	    int result = 0;
	    int length = str.length();
	    int index = 0;
	    char sign = '+';
	    
	    if(str.charAt(index) == '-')
	    {
	        sign = '-';
	        index++;
	    }
	    
	    while(index < length)
	    {
	        if(!Character.isDigit(str.charAt(index)))
	            return -1;
	        else
	            result = result * 10 + (str.charAt(index) - '0');
	            
	        index++;
	    }
	    
	    return sign == '-' ? -result : result;
    }
}
