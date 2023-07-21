package in.co.rays.basics;

public class PrintArrArrow {
	public static void main(String[] args) {
		int row = 5;
		int col = 6;
			
		for(int i= 0; i< 5; i++) {
			for (int j=0; j<6; j++) {
				
				if(i == 0 || i == 4) {
					if (j == 3) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else{
					if ((i == 1 || i == 3) && (j == 5) ) {
						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				}
			}
			System.out.println();
		}
	}

}
