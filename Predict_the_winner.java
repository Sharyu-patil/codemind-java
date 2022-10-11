import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,x=0,y=0,i,z;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                x=x+arr[i];
            }
            else
            {
                y=y+arr[i];
            }
        }
        z=Math.abs(x-y);
        if(z%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}