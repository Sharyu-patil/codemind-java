import java.util.Scanner;
class Sorted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int temp;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int []a=new int[20];
        int c=0;
        for(int i=0;i<n;i++)
        {
            int k=arr[i]*arr[i];
            a[c]=k;
            c++;
        }
        for(int i=0;i<c-1;i++)
        {
            for(int j=0;j<c-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
