import java.util.*;
public class MeetingRoomMadness
{
	public static int calculate(int n,int start[],int stop[])
	{
		int temp_start=start[0],temp_stop=stop[0],count=1;
		
		for(int i=1 ; i<n ; i++)
		{	
			if(start[i] > temp_start && temp_stop <= start[i])
			{
				temp_start = start[i];
				temp_stop = stop[i];
				count++;
			}		
		}
		return count;	
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int start[] = new int[n];
		int stop[] = new int[n];
		for(int i=0 ; i<n ; i++)
			start[i] = in.nextInt();
		for(int i=0 ; i<n ; i++)
			stop[i] = in.nextInt();
		int ans = calculate(n,start,stop);
		System.out.print(ans+" ");
	}
}