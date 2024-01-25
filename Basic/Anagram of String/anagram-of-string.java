//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
            
            int freq1[] = new int[26];
            int freq2[] = new int[26];
            int result = 0;
            
            for(int i = 0 ; i < s.length() ; i++)
            {
                char ch = s.charAt(i);
                
                freq1[ch - 'a']++;
            }
            
             for(int i = 0 ; i < s1.length() ; i++)
            {
                char ch = s1.charAt(i);
                
                freq2[ch - 'a']++;
            }
            
            for(int i = 0 ; i < 26 ; i++)
            {
                result += Math.abs(freq1[i] - freq2[i]);
            }
            
            return result;
        }
}