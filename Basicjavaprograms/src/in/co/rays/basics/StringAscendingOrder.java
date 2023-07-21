package in.co.rays.basics;

public class StringAscendingOrder 
{
	public static void main(String[] args) 
	{
		String string = "Kirti Shekhawat";
		char arr[]= string.toCharArray();
		
		char temp;
		int i=0;
		while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            }
		System.out.println(arr);
	}

}
