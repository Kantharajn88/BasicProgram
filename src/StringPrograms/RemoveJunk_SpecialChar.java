package StringPrograms;

public class RemoveJunk_SpecialChar 
{
public static void main(String[] args) 
{
String str="$%%^& *&^%$#@@@ Removed special character 234444";
str=str.replaceAll("[^a-zA-Z0-9]","");

System.out.println(str);
}

}