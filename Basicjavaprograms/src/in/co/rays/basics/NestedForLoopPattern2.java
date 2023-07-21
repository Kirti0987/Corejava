package in.co.rays.basics;

public class NestedForLoopPattern2 
{
	public static void main(String[] args) 
	{
	   char ch='A';
	   for(int r=1 ; r<=5 ; r++)
	   {
		   ch='A';
		   for(int c=1 ; c<=r ; c++)
		   {   
		   System.out.print(ch+" ");
		   ch++;
		   }
		   System.out.println();
	   }

}
}