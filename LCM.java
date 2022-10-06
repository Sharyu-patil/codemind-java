import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,b,gcd=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println(lcm);
    }
}