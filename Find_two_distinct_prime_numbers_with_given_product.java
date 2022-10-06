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
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(prime(i))
            {
                for(int j=1;j<n;j++)
                {
                    if(prime(j))
                    {
                        if(i*j==n)
                        {
                        y=1;
                        System.out.print(i+" "+j);
                        break;
                        }
                    }
                }
            }
            if(y==1)
            break;
        }
        if(y==0)
        System.out.print("-1");
    }
}
