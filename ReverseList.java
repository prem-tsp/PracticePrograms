import java.util.*;
public class ReverseList
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
			arr[i] = in.nextInt();
		reverse(arr,n);
	}
	public static void reverse(int arr[],int n)
	{
		for(int i=n-1 ; i>=0 ; i--)
		{
			if(i!=0)
				System.out.print(arr[i]+"->");
			else
				System.out.print(arr[i]);
		}
	}
}