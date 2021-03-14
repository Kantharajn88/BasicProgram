package number_programs;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{

		int num,temp,rem,sum=0;
		num=123;
		temp=num;
		while(num!=0)
		//for(int i=0;i<=num;i++)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;


		}
		if(temp==sum)
			System.out.println("Armstrong number is :"+temp);
		else
			System.out.println("Not a Armstrong number is :"+temp);
	}
}
