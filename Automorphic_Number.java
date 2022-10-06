import java.util.Scanner;
import java.lang.Math;
class Prog
{
    public static void main(String args[])
    {
        int t,count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        t=n;
        int k=n*n;
        while(t>0)
        {
            count++;
            t=t/10;
        }
        int last=(int)(k%(Math.pow(10,count)));
        if(n==last)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
}