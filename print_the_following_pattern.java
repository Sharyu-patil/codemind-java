import java.util.Scanner;
class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=n;k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<2*i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}