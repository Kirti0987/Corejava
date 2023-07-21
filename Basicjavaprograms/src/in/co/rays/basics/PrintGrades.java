
package in.co.rays.basics;

public class PrintGrades 
{
	public static void main(String[] args) {
		
		int marks=75;
		
		if (marks>80)
		{System.out.println("You have awarded to grade 'A'");}
	    
		else if (marks>=60 && marks<=80)
	    {System.out.println("You have awarded grade 'B'");}
	     
		else if(marks>=40 && marks<60)
		{System.out.println("You have awarded grade 'c'");}
		                            
		else
		{System.out.println("you have failed");}	
	
	}

}
