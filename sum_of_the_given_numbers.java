import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int a,b,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }    
        t--;
    }
}    