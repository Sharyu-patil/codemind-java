import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,fact=1,r,i,sum=0,t,prod=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
        r=n%10;
        sum=sum+r;
        prod=prod*r;
        n=n/10;
        }
        if(sum==prod)
        {
        System.out.print("Spy Number");
        }
        else
        {
        System.out.print("Not Spy Number");
        }
    }
}