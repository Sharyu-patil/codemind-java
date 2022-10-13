import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=n/2;
        for(int i=n-1;i>=k;i--)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}