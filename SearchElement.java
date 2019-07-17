import java.util.*;
public class SearchElement
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		if(search(n,k))
			System.out.print("Yes");
		else System.out.print("No");
	}
	public static boolean search(int n,int k)
	{
		Scanner in = new Scanner(System.in);
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = in.nextInt();
			if(arr[i]==k)
				return true;
		}
		return false;
	}
}