import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,t=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            else
            {
                System.out.println("Not Ugly Number");
                t=1;
                break;
            }
        }
        if(t==0)
        {
            System.out.println("Ugly Number");
        }
    }
}