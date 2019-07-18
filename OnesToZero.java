import java.util.*;
public class OnesToZero
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int arr[][] = new int[n][m];
		int visited[][] = new int[n][m];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<m ; j++)
			{	
				if(arr[i][j] == 0 && visited[i][j] == 0)
				{
					int k = 0;
					int l = j;
					while(k<n)
					{	
						if(arr[k][l]!=0)
						{
						arr[k][l]=0;
						visited[k][l]=1;
						}
						k++;
					}
					k = i;
					l = 0;
					while(l<m)
					{
						if(arr[k][l]!=0)
						{
						arr[k][l]=0;
						visited[k][l]=1;
						}
						l++;
					}
					
				}
			}
		}
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<m ; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}