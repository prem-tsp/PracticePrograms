import java.util.*;
import java.lang.*;
public class Numeric
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();
		int count = 0;
		for(int i=0 ; i<n ; i++)
		{
			if(str.charAt(i)>='1' && str.charAt(i)<='9')
			{
				count++;
			}
		}	
		if(count == n)
			System.out.print("yes");
		else System.out.print("no");
	}
}