import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,fact=1,r,i,sum=0,t;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        t=n;
        while(t>0)
        {
            r=t%10;
            fact=1;
            i=1;
            while(i<=r)
            {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("The number "+ n+" "+"is a strong number");
        }
        else
        {
            System.out.println("The number "+ n+" "+"is not a strong number");
        }
        
    }
}