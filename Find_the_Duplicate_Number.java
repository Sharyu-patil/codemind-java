import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,j,c=0;
        //int[] c=new int[n];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c=1;
                }
            }
            if(c==1)
            {
                System.out.print(a[i]);
                break;
            }
            else
            {
                continue;
            }
        }
       

    }
}