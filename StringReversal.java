import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a letter");
		
		String s = sc.nextLine();
		
		System.out.println(reverseString(s));
	}

	private static char[] reverseString(String s) {
		if (s.isEmpty()) {
			
		}
		return null;
	}

}
