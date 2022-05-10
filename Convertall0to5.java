// { Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
    
     String S=""+n;
    String S1= S.replace('0','5');
     
     int m=Integer.parseInt(S1);
     return m;
    }
}
