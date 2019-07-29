import java.util.*;
public class Product_of_num{
	public static void product(int arr[],int n)
	{
		int temp=1;
		int ans[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ans[i]=temp;
			temp*=arr[i];	
		}
               temp=1;
		for(int i=n-1;i>=0;i--)
		{
			ans[i]*=temp;
			temp*=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}

	public static void main(String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		product(arr,n);
	}
}