import java.util.Scanner;
class Tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,r;
        while(sum!=1&&sum!=4)
    {
        sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r;
            n=n/10;
        }
        n=sum;
    }
    if(sum==1)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }
    }
}
