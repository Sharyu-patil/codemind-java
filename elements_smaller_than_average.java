import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int x=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=x)
            {
                c=c+1;
            }
        }
        System.out.println(c);
    }
}