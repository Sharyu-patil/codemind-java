import java.util.Scanner;
class Prog
{
    public static void main(String args[])
    {
        int n,i,c=0,j,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           c=0;
           for(j=0;j<n;j++)
           {
               if(i!=j)
               {
                   if(arr[j]<arr[i])
                   {
                       c++;
                   }
               }
           }
           System.out.print(c+" ");  
        }
      
    }
}