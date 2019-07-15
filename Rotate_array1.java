import java.util.*;
class Rotate_array1 { 
	public static int[] rotate(int arr[], int d, int n) 
	{ 
		for (int i=0;i<d;i++)
		{ 
			rotateOne(arr, n); 
		}
		return arr;
	} 

	public static int[] rotateOne(int arr[],int n) 
	{ 
		int i,temp; 
		temp=arr[0]; 
		for (i=0;i<n-1;i++) 
		{
		arr[i] = arr[i + 1];
		} 
		arr[i] = temp; 
		
		return arr; 
	} 
 
	public static void main(String[] args) 
	{ 
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        int arr[]=new int[n];
	int shift=in.nextInt();
        for(int i=0;i<n;i++)
        {
          arr[i]=in.nextInt();
        }
        
	int[] ans=rotate(arr, shift, n);
	for(int j=0;j<n;j++)
	{
		System.out.print(arr[j]+" ");
	}  
	} 
} 