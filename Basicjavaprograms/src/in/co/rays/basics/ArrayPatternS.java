package in.co.rays.basics;

public class ArrayPatternS {

	public static void main(String[] args) {
	   
		int row = 8;
		int col = 5;
		
		for(int r=1; r<=8 ; r++)
		{
			for (int c=1 ; c<=5 ; c++)
			{
				if(r==1 || r==2 || (r==3 && c==1) || r==4 || r==5 || (r==6 && c==5) || r==7 || r==8)
				{
					System.out.print("**");				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------pattern K single star-----------");
		
		for(int r=1; r<=5 ; r++)
		{
			for (int c=1 ; c<=5 ; c++)
			{
				if(c==1 || (r==3 && c==2) || (r==2 && c==3) || (r==1 && c==4)||(r==4 && c==3)||(r==5 && c==4))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------pattern K double star-----------");
		
		for(int r=1; r<=5 ; r++)
		{
			for (int c=1 ; c<=5 ; c++)
			{
				if(c==1 || (r==3 && c==2) || (r==2 && c==3) || (r==1 && c==4)||(r==4 && c==3)||(r==5 && c==4))
				{
					System.out.print("*** ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		}
	}

