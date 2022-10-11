import java.util.Scanner;
class palindrom
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        double x;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        for(i=0;i<n;i++)
        {
            x=(int)Math.sqrt(arr[i]);
            if(x*x==arr[i])
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}