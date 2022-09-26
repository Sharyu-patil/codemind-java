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
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            count++;
        }
        int avrg=sum/count;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=avrg)
            {
                countt++;
            }
        }
        System.out.println(countt);
        sc.close();
    }
}
