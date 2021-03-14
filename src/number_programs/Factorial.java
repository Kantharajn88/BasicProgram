package number_programs;
//import java.util.Scanner;
public class Factorial 
{
public static void main(String[] args) 
{
	/*Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int num=sc.nextInt();*/
			int num=4;
	int fact=1;
			
			
			//while(num!=0)
			for(int i=1;i<=num;i++)
			
			{
				fact=fact*i;
				
			}
System.out.println(fact);			
}
}
