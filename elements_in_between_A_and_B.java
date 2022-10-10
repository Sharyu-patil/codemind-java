import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,y=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                y=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(y==0)
        {
            System.out.println("-1");
        }
        sc.close();
    }
}