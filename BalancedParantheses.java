import java.util.*;
public class BalancedParantheses
{
	public static boolean check(String paran)
	{
		int n = paran.length();
		int count = 0;
		for(int i=0 ; i<n ; i++)
		{
			if(paran.charAt(i)=='(')
				count++;
			else if(paran.charAt(i)==')' && count>0)
				count--;
			else return false;		
		}
		if(count == 0)
			return true;
		return false;	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String paran = in.nextLine();
		if(check(paran))
		{
			System.out.print("yes");
		}
		else System.out.print("no");
	}
}