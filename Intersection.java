import java.util.*;
public class Intersection
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int l=0,flag=0;
		int arr[][] = new int[n][k];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<k ; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		int ans[] = new int[k];
		for(int i=0 ; i<k ; i++)
		{
			ans[i] = arr[0][i];
		}
		/*for(int j=0 ; j<k ; j++)
		{
			for(int i=0 ; i<n ; i++)
			{
				if(ans[j] != arr[i][j])
				{
					ans[j]=-1;	
				}
			}
		}*/
		while(l<k)
		{
			for(int i=1 ; i<n ; i++)
			{	flag=0;
				for(int j=0 ; j<k ; j++)
				{
					if(ans[l]==arr[i][j])
					{
						flag=1;
						break;
					}
				}
				if(flag!=1)
					ans[l]=-1;
			}
			l++;
		}
		int count =0;
		for(int i=0 ; i<k ; i++)
		{
			if(ans[i]>=0)
			{
				//System.out.print(ans[i]+" ");
				count++;
			}
		}
		if(count == 0)
			System.out.print("-1");
		else
		{	
		for(int i=0 ; i<k ; i++)
		{
			if(ans[i]>=0)
			{
				System.out.print(ans[i]+" ");
				
			}
		}	
		}
	}
}