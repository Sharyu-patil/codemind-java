import java.util.Scanner;
class Palindrome
{
    static boolean prime(int n)
    {
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
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int k=x+y;
        for(int i=1;i<k;i++)
        {
            int m=k+i;
            if(prime(m))
            {
                System.out.print(i);
                break;
            }
        }
    }
}