package basep;

public class h {
	public static void main(String[] args)
	{
	int i,s=0,temp,n=787;
	{
		temp=n;
		while(n>0)
		{
			i=n%10;
			System.out.println(i);
			s=(s*10)+i;
			System.out.println(s);

			n=n/10;
		}
		if(temp==s)
		{
			System.out.println("palindrome");
		} else
			System.out.println("not a palindrome");
	}
	
}
}
