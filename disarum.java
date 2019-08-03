import java.util.*;
class disarum
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int a,n=0,c=0,b=0;
double s=0;
System.out.println("Enter a number to check for disarum");
a=sc.nextInt();
n=a;
while(n!=0)
{
c++;
n=n/10;
}
n=a;
for(int i=c;i>0;i--)
{
	b=n%10;
	s=s+Math.pow(b,i);
	n=n/10;
}

if(a==s)
{
System.out.println(a+" is a disarum number");
}
else
{
	System.out.println(a+" is not a disarum number");
}
}
}