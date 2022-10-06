import java.util.Scanner;
class palindrome
{
    static boolean prime(int x)
    {
        if(x<2)
        {
            return false;
        }
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(prime(n))
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}