import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,j,k,p1=0,p2=0,c=0;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        while(k>0)
       {
        n=sc.nextInt();
        c=0;
        p1=0;
        p2=0;
        for(i=n;i>2;i--)
        {
            c=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                p1=i;
                break;
            }
        }
        for(i=n;i<n+100;i++)
        {
            c=0;
            for(j=2;j<i;j++)
            {
               if(i%j==0)
               {
                   c=1;
                   break;
               }
            }
            if(c==0)
            {
                p2=i;
                break;
            }
        }
        if(n-p1<=p2-n)
        {
            System.out.println(p1);
        }
        else
        {
            System.out.println(p2);
        }
        k--;
    }
          
    }
}