import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        double p,r,t,ci,k;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        k=(1+r/100);
        ci=p*(Math.pow(k,t));
        System.out.format("%.2f",ci);
    }
}