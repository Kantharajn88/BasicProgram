package number_programs;
//import java.util.Scanner;
public class PalindramNumber 
{
	public static void main(String[] args) 
	{
	/*Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();*/
		int num=1231;
		int temp,rem,rev=0;
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		if(temp==rev)
		System.out.println("Paindrm number is:"+temp);
		else
			System.out.println("Not a Paindrm number is:"+temp);
	}
	

}
