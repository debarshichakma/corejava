
public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = " welcome to Java programming";
		  char chars [ ]= str.toString().toCharArray();
		  for (int i=chars.length-1; i>=0; i--) {
		  System.out.print(chars[i]);
		  }
		  }
	}
