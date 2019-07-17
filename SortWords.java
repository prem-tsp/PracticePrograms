import java.util.*;
import java.lang.*;
public class SortWords
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str[] = new String[n];
		for(int i=0 ; i<n ; i++)
		{
			str[i] = in.nextLine();
		}
		//String ans[] = new String[n]; 
		Arrays.sort(str);
		sort(str,n);
		//String a = Arrays.toString(str);
		//String ans[] = a.split(" ");
		for(int i=0 ; i<n ; i++)
		{
			System.out.print(str[i]+" ");
		}
			
	}
	public static String[] sort(String[] str, int n)
	{
		int j=0;
		String temp;
		for(int i=1 ; i<n ; i++)
		{
			j = i-1;
			temp = str[i];
			while(j>=0 && temp.length() < str[j].length())
			{
				str[j+1] = str[j];
				j--;
			}
			str[j+1] = temp;	
		}
		return str;
	}
}