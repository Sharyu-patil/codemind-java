import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(i*i==n)
            {
                x=1;
                break;
            }
        }
        if(x==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
      
    }
}
