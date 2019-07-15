import java.util.*;
public class EvenOddDisplace
{
	public static void num(int arr[],int n)
	{
		int j=0;
		int ans[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			if(i%2 == 0)
			{
				if(arr[i]%2 != 0)
				{
					ans[j] = arr[i];
					j++;
				}
			} 
			else 
			{
				if(arr[i]%2 == 0)
				{
					ans[j] = arr[i];
					j++;
				}
			}
		}
		if(j == 0)
			System.out.print("-1");
		else 
		{
			for(int i=0 ; i<j ; i++)
			{
				System.out.print(ans[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		num(arr,n);
	}
}