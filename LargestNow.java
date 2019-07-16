import java.util.*;
import java.lang.*;
public class LargestNow
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int max = Integer.MIN_VALUE;
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		int arr_new[] = new int[k];
		for(int i=0 ; i<k ;i++)
		{
			arr_new[i] = in.nextInt();
			if(arr_new[i]>max)
			{
				max = arr_new[i];
			}
			System.out.print(max+" ");
		}	
	}
}