import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        int sum=0,r;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        int b=sum+n;
        int r2=0;
        while(b!=r2)
        {
            int m=b;
            r2=0;
            while(m>0)
            {
                r=m%10;
                r2=r2*10+r;
                m=m/10;
            }
            if(r2!=b)
            {
                b=b+r2;
            }
        }
        System.out.print(r2);
    }
}