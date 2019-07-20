import java.util.*;
public class SumPalindrome
{
	public static boolean check(int num)
	{
		int sum = 0,n;
		while(num>0)
		{
			n = num%10;
			sum += n;
			num /= 10;	
		}
		int sumrev = sum;
		int sumans = 0;
		while(sumrev>0)
		{
			n = sumrev%10;
			sumans = sumans*10 + n;
			sumrev /= 10;	
		}
		if(sumans == sum)
			return true;
		else 
			return false;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(check(num))
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}