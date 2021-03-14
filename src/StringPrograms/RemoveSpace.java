package StringPrograms;

public class RemoveSpace 
{
public static void main(String[] args) 
{
	String str="java      is a program";
str=str.replaceAll("\\s","");
System.out.println(str);
}
}


