import java.util.*;
class co_prime
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter a number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int p= a*b;
        int i,m=0;
        for(i=1;i<=p;i++)
            {
              if (a%i==0 && b%i==0)
              m=i;
            }
       if (m==1)
	   {
           System.out.println("co-prime no.");
       }
	   else   
	   {		   
          System.out.println(" Not co-prime  no.");
	   }
	}
}