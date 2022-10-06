import java.util.Scanner;
class Odd
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
           if(arr[i]%2==0)
           {
               a[c]=arr[i];
               c++;
           }
           else
           {
               b[d]=arr[i];
               d++;
           }
        }
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<d;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}