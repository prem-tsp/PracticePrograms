import java.util.*;
import java.lang.*;
public class MinDistance
{
	public static int minDist(int arr[],int u,int v,int n)
	{
		int ans = 0,mini = Integer.MAX_VALUE,min1 = Integer.MAX_VALUE,ans1 = 0,count = 0,count1 =0;
		for(int i = 0;i < n; i++)
		{
			if(arr[i] == u)
			{	
				ans = 1;
				for(int j = i + 1;j < n; j++)
				{
					if(arr[j] != v)
						ans++;
					else 
					{		
						count++;
						break;
					}
				}
				if(ans < mini)
				{
					mini = ans;
				}
			}
		
		}
		
		for(int i = 0;i < n; i++)
		{
			if(arr[i] == v)
			{	
				ans1 = 1;
				for(int j = i + 1;j < n; j++)
				{
					if(arr[j] != u)
						ans1++;
					else 
					{	
						count1++;
						break;
					}
				}
				if(ans1 < min1)
				{
					min1 = ans1;
				}
			}
		}
	

		if(count > 0 && count1 > 0)
			return Math.min(mini,min1);
		else if(count > 0 && count1 == 0)
			return mini;
		else if(count == 0 && count1 > 0)
			return min1;
		else
			return Math.min(mini,min1);
		
	}
	public static boolean check(int arr[],int u,int v,int n)
	{
		int flag = 0,flag1 = 0;
		for(int i = 0;i < n; i++)
		{
			if(u == arr[i])
				flag = 1;
			else if(v == arr[i])
				flag1 = 1;			
		}
		if(flag == 1 && flag1 == 1)
		{
			return true;
		}
		else return false;
	}	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n; i++)
		{
			arr[i] = in.nextInt();
		}
		int u = in.nextInt();
		int v = in.nextInt();
		if(check(arr,u,v,n))
		{
			int ans = minDist(arr,u,v,n);
			System.out.print(ans);	
		}
		else System.out.print("-1");
	}
}