import java.util.*;
import java.lang.*;
public class MaximumMarks
{
	public static int sum(String a,String b,int index1,int index2,int len1,int len2)
	{
		int sum1 = 0,sum2 = 0;
		String temp1 = "";
		String temp2 = "";
		for(int i = index1 + 1;i < len1; i++)
		{
			char ch = a.charAt(i);   
                	if(Character.isDigit(ch))  
                		temp1 += ch;    
                	else
            		{  
                                sum1 += Integer.parseInt(temp1);  
      				temp1 = "0";  
               		}  
		}
		sum1 += Integer.parseInt(temp1);

		for(int i = index2 + 1;i < len2; i++)
		{
			char ch = b.charAt(i);   
                	if(Character.isDigit(ch))  
                		temp2 += ch;    
                	else
            		{  
                                sum2 += Integer.parseInt(temp2);  
      				temp2 = "0";  
               		}  
		}
		sum2 += Integer.parseInt(temp2);
		if(sum1 >= sum2)
		{
			return 1;
		}
		else return 0;
		
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		String name1 = "";
		String name2 = "";
		int index1 = 0,index2 = 0;
		int len1 = a.length();
		int len2 = b.length();
		for(int i = 0;i < len1; i++)
		{
			if(a.charAt(i) != '#')
				name1 += a.charAt(i);
			else 
			{
				index1 = i;
				break;
			}
		}
		for(int i = 0;i < len2; i++)
		{
			if(b.charAt(i) != '#')
				name2 += b.charAt(i);
			else
			{
				index2 = i;
				break;
			}
		}
		int ans = sum(a,b,index1,index2,len1,len2);

		if(ans == 1)
			System.out.print(name1);
		else System.out.print(name2);
	}
}