import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,t,c=0,sum=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}