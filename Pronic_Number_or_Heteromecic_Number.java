import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n-1;i++)
        {
            if(n==i*(i+1))
            {
                x++;
            }
        }
        if(x==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}