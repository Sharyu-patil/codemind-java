import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,y=0,max=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            count=0;
            if(arr[i]==-1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                    arr[j]=-1;
                }
            }
            if(count==0)
            {
                y=1;
                if(arr[i]>max)
                {
                    max=arr[i];
                }
            }
        }
        if(y==0)
        {
            System.out.print(-1);
        }
        else
        {
            System.out.print(max);
        }
    }
}
