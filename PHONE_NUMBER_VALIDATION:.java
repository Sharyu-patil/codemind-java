import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,b,t,count=0;
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while(n>0)
        {
          n=n/10;
          count++;
        }
        if(count==10)
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}