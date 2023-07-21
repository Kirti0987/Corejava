package in.co.rays.basics;

public class StringCompare 
{
public static void main(String[] args) 
{ String text="This is a java program";
     char ch = 'a';
     int count = 0;
     int length = text.length();
     System.out.println("Length is =" + length);
for(int i=0; i<length; i++)
    {
      if(text.charAt(i) == ch)
      {
	    count++;
      }
    }
System.out.println("Count of A="+count);
	}
}
