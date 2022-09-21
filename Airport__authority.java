import java.util.Scanner;
import java.lang.Math;
class palindrom
{
    public static void main(String args[])
    {
        int n,count=0,k,countt=0,counttt=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 
        }
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                count+=1;
            }
            else
            {
                countt+=2;
            }
        }
        counttt=count+countt;
        System.out.println(counttt);
        sc.close();
    }
}