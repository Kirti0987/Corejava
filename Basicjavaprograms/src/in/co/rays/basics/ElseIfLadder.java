package in.co.rays.basics;

public class ElseIfLadder {
public static void main(String[] args) {
	int budget=100;
	if (budget>=400)
	{
		System.out.println("you can buy large size pizza");
	}
	else if(budget>=300)
	{
		System.out.println("you can buy medium size pizza");
	}
	else if(budget>=200)
	{
	System.out.println("you can buy small size pizza");	
	}
	else
	{
		System.out.println("you can buy burgers");
	}
}
}
