import java.util.Scanner;
class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j>n-2)
                {
                    continue;
                }
                else
                {
                    System.out.print(j);
                }
            }
            for(int j=1;j<n-2;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}