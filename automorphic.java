import java.util.*;
class automorphic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,n,d,s=0,c=0,e,f=0,i;
System.out.println("Enter a number ");
a=sc.nextInt();
n=a;
	while(a!=0)
	{
			d=a%10;
			s=s*10+d;
			a=a/10;
			c++;
	}
d=n*n;

	for(i=1;i<=c;i++)
	{
			e=d%10;
			f=f*10+e;
			d=d/10;
	}
	
	if(s==f)
	{
		System.out.println(n+" is an automorphic number");
	}
	else
	{
		System.out.println(n+" is not an automorphic number");
	}

}
}