import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int aa=0,bb=0;
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                aa+=1;
            }
            else if(b[i]>a[i])
            {
                bb+=1;
            }
        }
        System.out.print(aa+" "+bb);
    }
}
