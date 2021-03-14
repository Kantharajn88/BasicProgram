package number_programs;

import java.util.Scanner;

public class ConvertFerToCelsius 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature in Fahrenheit");
	int temp=sc.nextInt();
	temp=((temp-32)*5)/9;
	System.out.println("Temperature in celsius is :"+emp);
}
}
