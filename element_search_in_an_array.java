import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,count=0,countt=0,sum=0,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==k)
            {
                y=1;
            }
        }
        if(y==1)
        System.out.println("True");
        else
        System.out.println("False");
        sc.close();
    }
}