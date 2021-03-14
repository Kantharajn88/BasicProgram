package number_programs;
//import java.util.Scanner;
public class Even_OddCount 
{
	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter  numbers");
		int num=sc.nextInt();*/
		
		int num=123;
		int evencount=0;
		int oddcount=0;
		while(num!=0)
		{
			int rem=num%10;
			num=num/10;
			if(rem%2==0)
				evencount++;
			else
				oddcount++;
		}
		System.out.println("Even count number is :"+evencount);
		System.out.println("Odd count number is :"+oddcount);
	}
}
