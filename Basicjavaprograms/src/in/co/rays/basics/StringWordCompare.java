package in.co.rays.basics;

public class StringWordCompare 
{
public static void main(String[] args)
{
	String string = "This is a Java Program. Java is case sensitive. Java is OOPS language";
	String word = "Java";
	String temp[] = string.split(" ");
	
	int count =0;
	for (int i=0; i<temp.length;i++ ) 
	{
		if(word.equals(temp[i]))
		count++;
	}
	System.out.println("The string is = "+string);
	System.out.println("The word "+word+" occurs "+count+" times in the given string");
}
}
