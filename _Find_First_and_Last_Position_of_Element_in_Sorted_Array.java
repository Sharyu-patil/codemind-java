import java.util.Scanner;
class Prog
{
	public static void main(String[] args)
	{
		int n,i,k,y=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
		    if(arr[i]==k)
		    {
		        y=1;
		        System.out.print(i+" ");
		        break;
		    }
		}
		for(i=n-1;i>=0;i--)
		{
		    if(arr[i]==k)
		    {
		        y=1;
		        System.out.print(i+" ");
		        break;
		    }
		}
		if(y==0)
		{
		    System.out.print("-1 -1");
		}
      
	}

}