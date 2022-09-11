import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int t,i;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
        
    }
}