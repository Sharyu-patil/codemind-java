import java.util.Scanner;
class Division
{
    public static void main(String args[])
    {
        int f;
        float c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextInt();
        c=(float)((f-32)*5)/9;
        System.out.format("%.2f",c);
        sc.close();
    }
}