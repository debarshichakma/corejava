import java.util.Scanner;

public class ReverseInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, reversestr = " " ;
		Scanner in = new  Scanner(System.in);
		System.out.println("Enter the line");
		str = in.nextLine();
		int strlen=str.length();
		
		for( int i = strlen -1; i>=0; i-- ) {
			reversestr = reversestr + str.charAt(i);
			
		}
		
		System.out.println(reversestr);
	}

	}


