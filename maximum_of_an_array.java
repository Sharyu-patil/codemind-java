import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        int count=0,y=0,sum=0,i=0;
        float avrg;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}