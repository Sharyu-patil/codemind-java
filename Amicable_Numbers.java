import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,b,i,j,x=0,y=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                x=x+i;
            }
        }
        for(j=1;j<b;j++)
        {
            if(b%j==0)
            {
                y=y+j;
            }
        }
        if(y==a&&x==b)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}
