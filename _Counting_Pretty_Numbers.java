import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,b,t,count=0,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
         while(t>0)
        {
            count=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(i=a;i<=b;i++)
            {
                if(i%10==2||i%10==3||i%10==9)
                {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
        
    }
}