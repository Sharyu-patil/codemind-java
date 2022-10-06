import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,t=0,temp,r;
        double sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            t++;
        }
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+Math.pow(r,t);
            temp=temp/10;
            t--;
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sc.close();
    }
}