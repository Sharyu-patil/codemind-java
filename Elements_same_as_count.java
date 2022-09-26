import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,count=0,countt=0,sum=0,y=0;
        float avrg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
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
           if(count==arr[i])
           {
               y=1;
               System.out.print(arr[i]+" ");
           }
        }
        if(y==0)
        {
            System.out.println("-1");
        }
        sc.close();
    }
}