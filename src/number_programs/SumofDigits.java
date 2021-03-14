package number_programs;

import java.util.Scanner;

public class SumofDigits 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	
	{
		
		System.out.println("Enter a Digits");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		System.out.println(sum);
		
	}

}
