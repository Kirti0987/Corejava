package in.co.rays.basics;

public class LadderMovie 
{
public static void main(String[] args) {
	int ticket=200;
	
	if(ticket>=2000)
	{System.out.println("You can buy 'First class' movie ticket");}
    
	else if(ticket>=1000)
	{System.out.println("You can buy a 'Buisness Class' movie ticket");}
	
	else if(ticket>=500)
	{System.out.println("You can buy 'Economic Class' movie ticket");}

	else 
	{System.out.println("You can go for Black ticket");}

}
}
