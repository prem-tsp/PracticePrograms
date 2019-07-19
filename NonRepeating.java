import java.util.*;
import java.lang.*;
public class NonRepeating
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		int n = inp.length();
		ans(inp,n);
	}
	public static void ans(String inp,int n)
	{
		int map[] = new int[256];
		int k,j=0,temp=0,count=0;
		for(int i=0 ; i<n ; i++)
		{
			map[inp.charAt(i)]++;
		}
		for(int i=0 ; i<256 ; i++)
		{
			if(map[i]>0)
				System.out.printf("%c",i);
				
		}
		
	}
}