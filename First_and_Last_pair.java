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
        int k=n/2;
        for(int i=0;i<k;i++)
        {
            a[c]=arr[i];
            c++;
        }
        for(int i=n-1;i>=k;i--)
        {
            b[d]=arr[i];
            d++;
        }
        if(n%2==0)
        {
            for(int i=0;i<c;i++)
            {
                System.out.print(a[i]+" ");
                System.out.print(b[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<c;i++)
            {
                System.out.print(a[i]+" ");
                System.out.print(b[i]+" ");
            }
            System.out.print(b[k]+" ");
            System.out.print("0");
        }
    }
}