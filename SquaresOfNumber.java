import java.util.*;
public class SquaresOfNumber
{
	public static int ans(int n)
	{
		int num = 0,sum = 0;
		while(n>0)
		{
			num = n%10;
			sum += num*num;
			n /= 10;	
		}	
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = ans(n);
		System.out.print(a);
	}
}