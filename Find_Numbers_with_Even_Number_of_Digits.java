import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,j,r,k,c=0,x=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            k=arr[i];
            while(k>0)
            {
                r=k%10;
                c++;
                k=k/10;
            }
            if(c%2==0)
            {
                x++;
            }
        }
        System.out.print(x);
    }
    
}