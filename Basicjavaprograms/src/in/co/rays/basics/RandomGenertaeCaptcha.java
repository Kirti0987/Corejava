package in.co.rays.basics;

public class RandomGenertaeCaptcha 
{
	public static void main(String[] args)
		
	{
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String captcha = " ";
        String enteredcaptcha= "23hhja";
		 
        for (int i = 0; i < 6; i++) 
        {
            int rand = (int)(Math.random() * str.length());
            captcha = captcha + str.charAt(rand);   
       
	    }
        
        System.out.println(captcha);
        
        if(captcha.equals(enteredcaptcha))
        {System.out.print("Verified: you can enter into application.");}
        else
        {System.out.println("Unverified: you cannot entered into application.");}
}
}