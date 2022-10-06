import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,n,i,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.print("True");
        }
        for(i=3;i<=n;i++)
        {
            n3=n1+n2;
            if(n3==n)
            {
                y=1;
                System.out.print("True");
                break;
            }
            n1=n2;
            n2=n3;
        }
        if(y==0)
        System.out.print("False");
        sc.close();
    }
}