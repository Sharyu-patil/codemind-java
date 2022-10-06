import java.util.Scanner;
class Palindrome
{
    static boolean palindrome(int n)
    {
        int sum=0;
        int k=n;
        while(k>0)
        {
            int r=k%10;
            sum=sum*10+r;
            k=k/10;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(palindrome(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
