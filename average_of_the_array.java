import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        int count=0,y=0,sum=0;
        float avrg;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            count+=1;
        }
        avrg=(float)sum/count;
        System.out.format("%.2f",avrg);
    }
}