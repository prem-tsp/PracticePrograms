import java.util.*;
public class IslandProblem1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int flag=1;
		int n = in.nextInt();
		int count = 0;
		int arr[][] = new int[n][n];
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}
		for(int i=0 ; i<n ; i++)
		{ 
			for(int j=0 ; j<n ; j++)
			{
				flag=1;
				if(arr[i][j] == 1)
				{
					if(isValid(i+1,j,n))
					{
						if(arr[i+1][j] == 1)
						{	flag=0;
							break;
						}	
							
					}
					if(isValid(i,j+1,n))
					{
						if(arr[i][j+1] == 1)
						{	flag=0;
							break;
						}
					}
					if(isValid(i-1,j,n))
					{
						if(arr[i-1][j] == 1)
						{	flag=0;
							break;
						}
					}
					if(isValid(i,j-1,n))
					{
						if(arr[i][j-1] == 1)
						{	flag=0;
							break;
						}
					}
				}
				else flag=0;
				if(flag == 1)
					count++;
			}
			
		}
		System.out.print(count);
	}
	public static boolean isValid(int i, int j,int n)
	{
		if(i<0 || j<0 || i>n-1 || j>n-1)
			return false;
		return true;
	}
}