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
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}