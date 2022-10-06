import java.util.Scanner;
class Wave
{
    public static void main(String args[])
    {
        int y=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                if(arr[i]%2!=0)
                {
                    y+=arr[i];
                }
            }
        }
        System.out.print(y);
    }
}