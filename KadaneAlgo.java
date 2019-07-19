import java.util.*;
public class KadaneAlgo
{
	public static int kadane(int arr[],int n)
	{
		int max_current = arr[0];
		int max_global = arr[0];
		for(int i=1 ; i<n ; i++)
		{
			max_current = Math.max(arr[i],max_current+arr[i]);
			if(max_global<max_current)
				max_global = max_current;
		}
		return max_global;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = in.nextInt();
		int ans = kadane(arr,n);
		System.out.print(ans);
	}
}