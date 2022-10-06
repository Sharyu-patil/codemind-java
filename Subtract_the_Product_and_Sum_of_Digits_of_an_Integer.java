import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,r,sum=0,prod=1,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        res=prod-sum;
        System.out.println(res);
        
       
    }
}