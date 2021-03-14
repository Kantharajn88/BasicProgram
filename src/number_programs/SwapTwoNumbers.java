package number_programs;

import java.util.Scanner;

public class SwapTwoNumbers 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a first number");
	int a=sc.nextInt();
	System.out.println("Enter a second Number");
	int b=sc.nextInt();
	int temp;
	System.out.println("Before swapping :"+a+" "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping :"+a+" "+b);
	

}
}
