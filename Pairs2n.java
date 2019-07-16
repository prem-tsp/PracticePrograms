import java.util.*;
public class Pairs2n
{
	public static long ans(long n)
	{
		int count=0;
		for(int i=0 ; i<n-1 ; i++)
		{
			for(int j=i+1 ; j<n ; j++)
			{
				count++;
			}
		}
		return count;

	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long a = ans(n);
		System.out.print(a);
	}
}