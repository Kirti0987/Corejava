package in.co.rays.basics;

public class OneDemArray {
	public static void main(String[] args) {
		int a1[];
		a1 = new int [10];
		System.out.println("The table of 2 is: ");
		for(int i=0 ; i<10 ; i++)
		{
			a1[i]=(i+1)*2;
			System.out.println(+a1[i]);
		}
	}

}
