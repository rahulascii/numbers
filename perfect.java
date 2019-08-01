import java.util.*;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter a number");
        int n= sc.nextInt();
        int i=0,s=0;
        int m = n;
        for(i=1;i<n;i++)
        {
            if (n%i==0)
            s=s+i;
        }
       if(s==m)
	   {
           System.out.println(" perfect no.");
       }
	   else
	   {		   
          System.out.println(" Not perfect no.");
        }
	}
}