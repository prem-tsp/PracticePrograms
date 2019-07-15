import java.util.*;
class IndexNumber
{
	public static void num(int arr[],int n)
	{
		int j=0;
		int ans[]=new int[n];
		for(int i=0 ; i<n ; i++)
		{
			if(i==arr[i])
			{
				ans[j]=i;
				j++;
			}
		}
		for(int i=0 ; i<j ; i++)
		{
			System.out.print(ans[i]+" ");
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