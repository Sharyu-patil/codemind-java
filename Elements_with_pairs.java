import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        int y=0,c=0,d=0;
        int a[]=new int[20];
        int b[]=new int[20];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        if(n%2!=0)
        {
            System.out.print(0);
        }
    }
}