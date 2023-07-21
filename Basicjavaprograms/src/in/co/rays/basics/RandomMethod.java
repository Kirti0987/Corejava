package in.co.rays.basics;

public class RandomMethod 
{
	public static void main(String[] args)
	{
		int max = 200;
        int min = 100;
        int range = max - min + 1;
       
        for (int i = 0; i < 1; i++) 
        {
        	 int rand = (int)(Math.random() * range) + min;
             System.out.print(rand);
               
		}
		
	}
}
