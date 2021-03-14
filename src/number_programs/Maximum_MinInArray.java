package number_programs;

public class Maximum_MinInArray 
{
	public static void main(String[] args) 
	{
		/*int a[]={50,30,50,60,70};
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
System.out.println("maximum number is :"+max);
}*/
		int a[]={0,2,3,49,30};
		int min=a[0];
		for(int i=1;i<a.length;i++)
			
		{
			if(a[i]<min)
			{
				min=a[i];

			}

			//System.out.print(min);
		}
		System.out.println(min);
	}}









