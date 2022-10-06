import java.util.Scanner;
class Prog
{
    static boolean prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,sqr,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            {
                System.out.println(i);
            }
        }
        
    }
}