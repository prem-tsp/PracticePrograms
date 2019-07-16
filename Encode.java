import java.util.*;
import java.lang.*;
public class Encode
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = s.length();
		String encode = "abcdefghijklmnopqrstuvwxyzabc";
		String ans = "";
		int k=0,j=0;
		while(k<n)
		{
		for(int i=0 ; i<29 ; i++)
		{
			if(encode.charAt(i)==s.charAt(k))
			{
				j = i+3;
				ans += encode.charAt(j);
				k++;
				break;
			}
			else 
			{
				continue;
			}
			
		}
		}
		System.out.print(ans);
	}
}