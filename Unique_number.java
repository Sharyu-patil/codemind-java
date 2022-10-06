import java.util.Scanner;
class Circular
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,y=0,count=0;
        int []arr=new int[20];
        while(n!=0)
        {
            int r=n%10;
            arr[c]=r;
            n=n/10;
            c++;
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    y=1;
                    System.out.print("Not Unique Number");
                    break;
                }
            }
            if(y==1)
            break;
        }
        if(y==0)
        System.out.print("Unique Number");
        
    }
}
