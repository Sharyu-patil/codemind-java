import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int t,i,n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(i=3;i<=t;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        sc.close();
        
    }
}