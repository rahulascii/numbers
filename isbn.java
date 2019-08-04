import java.util.*;
class isbn
{
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
		long a,n,s=0,d=0;
		int x=0;
        System.out.println(" Enter a 10 digit number");
        n= sc.nextLong();
		a=n;
		while(n!=0)
		{
			n=n/10;
			x++;
		}
		if(x==10)
		{
			n=a;
			for(x=10;x>=1;x--)
			{
				d=n%10;
				s=s+d*x;
				n=n/10;
			}
			System.out.println("The sum of digits with respect to their base is "+s);
			if(s%11==0)
			{
				
			System.out.println(a+" is a isbn number");
			}
			else
			{
			System.out.println(a+" is not a isbn number");
			}
				
		}
		else
		{
			System.out.println("not a 10 digits number");
		}
	}
}