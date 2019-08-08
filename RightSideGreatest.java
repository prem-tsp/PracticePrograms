import java.util.*; 
  
public class RightSideGreatest  
{ 
    public static void compute(int arr[],int n) 
    {   
	int t = 0;
        int max = arr[n-1]; 
        arr[n-1] = 0; 
  	for (int i = n - 2;i >= 0; i--) 
        { 
            t = arr[i]; 
            arr[i] = max; 
            if(max < t) 
            	max = t; 
        }
	for(int i = 0;i < n; i++)
	{
		if(i == n-1)
			System.out.print(arr[i]);
		else
			System.out.print(arr[i]+" ");
	} 
    }  
  
    public static void main (String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        int n = in.nextInt();
	int arr[] = new int[n];
	for(int i = 0;i < n; i++)
	{
		arr[i] = in.nextInt();
	}
	compute(arr,n);  
    } 
} 