import java.util.*;
public class SearchElement2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		int flag = 0;
		for(int i=0; i<n ; i++)
		{
			arr[i] = in.nextInt();
			if(arr[i] == k)
				flag = 1;	
		}
		if(flag == 1)
			System.out.print("Yes");
		else System.out.print("No");
	}
}