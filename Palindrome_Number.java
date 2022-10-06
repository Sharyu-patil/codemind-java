import java.util.Scanner;
import java.lang.Math;
class palindrome
{
    static boolean palindrome(int x)
    {
        int k=x;
        int sum=0;
        while(k!=0)
        {
           int r=k%10;
           sum=sum*10+r;
           k=k/10;
        }
        if(sum==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            if(palindrome(n))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}