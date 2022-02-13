package basep;

public class str {

	
	public static void main(String[] args)
	{
		
		String str1= "A2B3C4";
		int i = str1.length();
		int j= str1.indexOf(i);
		
		for(j=0; j<i ; j++)
		{
			j=j+str1.charAt(i);
		System.out.println(j);
		}		
		
		
	}
}
