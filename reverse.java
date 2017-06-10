import java.util.*;

class reverse 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String b=s.next();
		StringBuffer c=new StringBuffer();
		c.append(b);
		c=c.reverse();
		for(int i=0;i<b.length();i++)
		{
		    System.out.println(c.charAt(i));
		}
	}
}
