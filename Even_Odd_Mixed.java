import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int even=0,odd=0;
        while(x!=0)
        {
            int r=x%10;
            if(r%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
            x=x/10;
        }
        if(even>0 && odd==0)
        System.out.print("Even");
        else if(odd>0 && even==0)
        System.out.print("Odd");
        else
        System.out.print("Mixed");
    }
}