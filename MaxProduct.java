import java.util.*;
public class MaxProduct
{
	public static int product(int arr[],int n)
	{
		int max_val = arr[0];
		int min_val = arr[0];
		int max_pro = arr[0];
		for(int i=1 ; i<n ; i++)
		{
			int temp;
			if(arr[i]<0)
			{
				temp = max_val;
				max_val = min_val;
				min_val = temp;
			}
			max_val = Math.max(arr[i],(max_val*arr[i]));
			min_val = Math.min(arr[i],(min_val*arr[i]));
			max_pro = Math.max(max_val,max_pro);
		}
		return max_pro;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = in.nextInt();
		int ans = product(arr,n);
		System.out.print(ans+" ");
	}
}