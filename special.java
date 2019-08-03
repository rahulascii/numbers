import java.util.*;
class special
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter a number");
        int n= sc.nextInt();
        int i,d,c,f=1;
        int m = n;
        int s=0;
        while (n!=0)
        {
            d=n%10;
            f=1;
            for(i=1;i<=d;i++)
			{
             f=f*i;
			}
            s=s+f;
			n=n/10;
        }          
       if (s==m)
           System.out.println("Special no.");
       else      
          System.out.println(" Not Special no.");
        
	}
}