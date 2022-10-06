import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,r,x=0,y,a,b,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        y=n*n;
        while(n>0)
        {
            r=n%10;
            x=x*10+r;
            n=n/10;
        }
        a=x*x;
        while(a>0)
        {
            b=a%10;
            c=c*10+b;
            a=a/10;
        }
          
        if(y==c)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}