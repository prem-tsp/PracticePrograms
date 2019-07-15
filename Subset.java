import java.util.*;
public class Subset
{
	public static boolean check(int arr1[],int m,int arr2[],int n)
	{
		int j=0;
		for(int i=0 ; i<n ; i++)
		{
			for(j=0 ; j<m ; j++)
			{
				if(arr2[i] == arr1[j])
					break;
			}
			if(j==m)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int arr1[] = new int[m];
		int arr2[] = new int[n];
		for(int i=0 ; i<m ; i++)
		{
			arr1[i]=in.nextInt();	
		}
		for(int j=0 ; j<n ; j++)
		{
			arr2[j]=in.nextInt();
		}
		if(check(arr1,m,arr2,n))
			System.out.print("YES");
		else System.out.print("NO");
	}	
}