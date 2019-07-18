import java.util.*;
public class PrimeInBinary
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		binaryPrime(a,b);
	}
	public static void binaryPrime(int a,int b)
	{
		int count = 0, mod = 0, ans = 0,j;
		for(int i=a ; i<=b ; i++)
		{	count = 0;
			j=i;
			while(j>0)
			{
				mod = j%2;
				if(mod==1)
				{
					count++;
				}
				j /= 2;
			}
			if(prime(count))
				ans++;
		}
		System.out.print(ans);
	}
	public static boolean prime(int count)
	{
		if(count == 1)
			return false;
		for(int i=2 ; i<=count/2;i++)
		{
			if(count%i==0)
				return false;
		}
		return true;
	}
}