import java.io.*;
/**
 * This program prints out all digits of entered number
 * 
 * */
class Digit
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter any no.-");
		int n=0;
		
			n = Integer.parseInt(br.readLine());
		
		int digit, i;
		for(i=n;i>0;i=i/10)
		{	
			digit=i%10;
			System.out.println(digit);
		}
	}
}
