package in.co.rays.basics;
/*A
 B B
 C C C
 D D D D
 E E E E E
 */
public class NestedForLoopPatterns 
{
public static void main(String[] args) 
{
   char ch='A';
   for(int r=1 ; r<=5 ; r++)
   {
	   for(int c=1 ; c<=r ; c++)
	   {   
	   System.out.print(ch+" ");
	   }
	   System.out.println();
	   ch++;
   }
}
}
