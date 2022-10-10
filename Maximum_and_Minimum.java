import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,count=0,countt=0,sum=0,y=0,c=0;
        float avrg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int[] a=new int[20];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           count=1;
           if(arr[i]==-1)
           {
               continue;
           }
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]==arr[j])
               {
                   count++;
                   arr[j]=-1;
               }
           }
           if(arr[i]==count)
           {
               y=1;
               a[c]=arr[i];
               c++;
           }
        }
        if(y==0)
        {
            System.out.print("-1");
        }
        else
        {
        int min=a[0];
        for(int i=0;i<c;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        int max=a[0];
        for(int i=0;i<c;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.print(min+" "+max);
        }
    }
}