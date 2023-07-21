package in.co.rays.basics;

public class Array1To10Table {
	public static void main(String[] args) {
		
    int rows =10;
    int col=9;
    int mult[][]=new int[rows][col];
    //rows = new int [10];
    //col = new int [10];
    
    for(int i=0 ; i<mult.length ; i++)
    {
    	for (int j=0 ; j<mult[i].length ; j++)
    	{
    		mult[i][j] = (i+1)*(j+2);
    	}
    }
    
    for(int i=0 ; i<mult.length ; i++)
    {
    	for (int j=0 ; j<mult[i].length ; j++)
    	{
    		System.out.print(mult[i][j]+"\t");
    	}
    	System.out.print("\n");
    }
}
}
