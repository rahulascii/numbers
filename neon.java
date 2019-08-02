import java.util.*;
public class neon
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ob.nextInt();
        int s=n*n;
        int sum=0;
        while(s!=0)
        {
            int a=s%10;
            sum=sum+a;
            s=s/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is a Neon Number.");
        }
        else
        {
            System.out.println(n+" is not a Neon Number.");
        }
    }
}