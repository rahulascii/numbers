import java.util.*;
class pronic
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter a number");
        int n= sc.nextInt();
        int k=0,i;
        double s=0.0;;
        for(i=1;i<=(n/2);i++)
        {
            if (i*(i+1)==n)
            {
                k=1;
                break;
            }
        }
       if (k==1)
           System.out.println("pronic no.");
       else      
          System.out.println(" Not pronic no.");

        }}