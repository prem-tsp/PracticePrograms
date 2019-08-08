import java.util.*;
public class Demonetisation
{
	public static int money(int num,int m[])
	{
		int count = 0,i = 0;
		int n = num;
		while(n > 0)
		{
			while(i < 6)
			{
				if(n - m[i] >= 0)
				{
					count++;
					n -= m[i];
				}
				else i++;
			}
		}
		return count;			
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int m[] = {1000,500,100,50,10,1};
		int ans = money(num,m);
		System.out.print(ans);
	}
}