import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,sqr,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sqr=n*n;
        while(sqr>0)
        {
            rem=sqr%10;
            sum=sum+rem;
            sqr=sqr/10;
        }
        
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        
    }
}