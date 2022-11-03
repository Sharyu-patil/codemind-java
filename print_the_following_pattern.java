import java.util.Scanner;
class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}