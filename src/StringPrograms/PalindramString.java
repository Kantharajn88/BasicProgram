package StringPrograms;

public class PalindramString 
{
	public static void main(String[] args) 
	{
		String str="MADAMA";
		String rev="";
		String orgstr=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(orgstr.equals(rev))

			System.out.println("Palindram string is:"+orgstr);
		else
			System.out.println("Not a Palindramstring :"+orgstr);
	}


}
