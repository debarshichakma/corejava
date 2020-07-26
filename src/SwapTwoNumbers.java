import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
				int temp, x, y;
				System.out.println("Enter the number");
				Scanner in = new Scanner(System.in);
				x = in.nextInt();
				y = in.nextInt();
				System.out.println(" Before swap:= "+x+"  "+y);
				 temp = x; 
				 x=y;
				 y=temp;
				 System.out.print("after swap: ="+x+" "+y);
				 }
		}
