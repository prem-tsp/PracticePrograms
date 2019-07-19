import java.util.*;
public class Alternating_ab_count
{
	public static int count(String str)
	{
		int n = str.length();
		int count = 1,max_count=0;
		for(int i=0 ; i<n-1 ; i++)
		{
			if(str.charAt(i)=='a' && str.charAt(i+1)=='b')
				count++;
			else if(str.charAt(i)=='b' && str.charAt(i+1)=='a')
				count++;
			else count=1;
			if(max_count<count)
				max_count = count;
		}
		return max_count;		
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int ans = count(str);	
		System.out.print(ans+" ");	
	}
}