import java.util.*;
public class RemoveSpace
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		int n = inp.length();
		char ch[] = new char[inp.length()];
		for(int i=0 ; i<n ; i++)
		{
			ch[i]=inp.charAt(i);
			if(ch[i]!=' ')
				System.out.print(ch[i]);
		}
	}
}