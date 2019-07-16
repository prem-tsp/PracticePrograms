import java.util.*;
public class PairElement
{
	public static boolean ans(int arr[],int n,int k)
	{	
		for(int i=0 ; i<n-1 ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(arr[i]+arr[j]==k)
					return true;
			}
		}
		return false;	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = in.nextInt();
		}
		if(ans(arr,n,k))
			System.out.print("yes");
		else System.out.print("no");
	}
}