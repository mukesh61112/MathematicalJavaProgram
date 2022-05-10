// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            int ans  = ob.oppositeFaceOfDice(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int oppositeFaceOfDice(int N){
        // code here
        int arr[]={1,2,3,4,5,6};
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            if(arr[i]==N)
                return arr[l-(i+1)];
        }
        return -1;
    }
}
