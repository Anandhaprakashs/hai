import java.util.*;
class count
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		while(a>0)
		{
		    a=a/10;
		    b=b+1;
		}
		System.out.println(b);
	}
}
