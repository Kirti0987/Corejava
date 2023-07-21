package in.co.rays.basics;

public class HelloName {
	public static void main(String[] args) 
	{
		int length=args.length;
		if (length==0)
		{
		    System.out.println("Hello to all");
		}
		else
		{
			for(String name:args)
			{
			System.out.println("Hello : " +name);	
		    }
		}
	}

}
