import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]%2==0 && arr[i+2]%2==0)
            {
                if(arr[i+1]%2==0)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}