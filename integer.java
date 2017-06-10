import java.util.*;
class integer
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner (System.in);
		String str=s.next();
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
		    int a=c[i];
		    System.out.println(a);
		}
	}
}
