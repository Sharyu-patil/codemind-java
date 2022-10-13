import java.util.*;
class prog
{
    public static int gcd(int a,int b)
    {
        int i,gcdd=0;
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcdd=i;
            }
        }
        return gcdd;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,gcdd,i,n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        n1=arr[0];
        n2=arr[1];
        gcdd=gcd(n1,n2);
        for(i=2;i<n;i++)
        {
            gcdd=gcd(arr[i],gcdd);
        }
         
        System.out.println(gcdd);
    }
}