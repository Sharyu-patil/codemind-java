import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
     int temp=0,sum=0,count=0,i,n,r;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(i=2;i<n;i++)
     {
        if(n%i==0)
        count++;
     }
     if(count==0)
     {
        while(n>0)
        {
            sum=0;
            r=n%10;
            for(i=2;i<r;i++)
            {
                if(r%i==0)
                sum++;
            }
            if (r==1)
            temp++;
            n=n/10;
        }
    }
    if(count ==0&& sum==0&&temp!=1)
    System.out.println("Mega Prime");
    else
    System.out.println("Not Mega Prime");
    
    }
}