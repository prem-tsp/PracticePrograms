import java.util.*;
public class RepeatNumber
{
	public static boolean num(int arr[],int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]);
					return true;
				}
			}
		}
	return false;
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
		if(!num(arr,n))
		{
			System.out.print("Unique");	
		}
	}
}