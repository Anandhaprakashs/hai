import java.util.*;
class GFG 
{
	public static void main (String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		for(int i=0;i<a.length();i++)
		{
		    char c=a.charAt(i);
            if ((64<c||96<c)&&(91>c||123>c)) 
            {
                System.out.println(c+"is a alphabet");
            }
            else
            {
                System.out.println(c+"is not a alphabet");
            }
		}
	}
}
