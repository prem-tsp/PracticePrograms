import java.util.*;
public class RemoveElements
{
	public static void remove(int[] arr, int key,int n) 
	{   
        	int index = 0; 
        	for (int i = 0;i < n; i++) 
        		if (arr[i] != key) 
        			arr[index++] = arr[i];   
        	int ans[] = Arrays.copyOf(arr, index);
		if(index == 0)
			System.out.print("empty");
		else
		{
		for(int i = 0;i < index; i++)
		{
			if(i == index-1)
				System.out.print(ans[i]);
			else
				System.out.print(ans[i]+" ");
		}
		}	 
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int key = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n; i++)
			arr[i] = in.nextInt();
		remove(arr,key,n);
	} 
}