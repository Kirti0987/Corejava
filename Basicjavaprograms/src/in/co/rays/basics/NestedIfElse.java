package in.co.rays.basics;

public class NestedIfElse 
{
	public static void main(String[] args) {
		
		int pre,mains,criteria;
		pre=90;
		mains=99;
		criteria=80;
		if(pre>=criteria)
		{
		       if (mains<=criteria)
		       {
			     System.out.println("You are selected");
		       }
		       else
		       {
			     System.out.println("Your mains score= " + mains + " is less than the criteria=" +criteria);
		       }
		}
		else 
		{
		
			System.out.println("Your mains score= " + pre + " is less than the criteria=" +criteria);
		}
		}
	}


