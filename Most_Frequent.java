import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,j,count=0,m=0,b=0;
        //int[] c=new int[n];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count>m)
            {
                m=count;
                b=arr[i];
            }
            else if(count==m && arr[i]<b)
            b=arr[i];
        }
        System.out.print(b);
    }
}