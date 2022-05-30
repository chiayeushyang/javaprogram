import java.util.Scanner;

public class exercise2q9{
	
	public static void main(String [] args) {
		Scanner kyb = new Scanner(System.in);
		System.out.print("Please enter your password = ");
		String password = kyb.nextLine();
		if (eight_characters(password)==true && letter_digit(password)==true && two_digit(password)==true ) {
			System.out.print("Valid Password");
		} else {
			System.out.print("Invalid Password");
		}
		
	}
	public static boolean eight_characters (String str1) {
		boolean check;
		if (str1.length() >= 8) {
			check = true;
		}
		else{
		check = false;}
		return check;
	}
	
	public static boolean letter_digit (String str1) {
		boolean check = true;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isLetter(str1.charAt(i)) || Character.isDigit(str1.charAt(i))){
				check = true;
			}
			else {
				check = false;
				break;
			}
		}
		return check;
	}
	
	public static boolean two_digit (String str1) {
		int digit = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isDigit(str1.charAt(i))){
				digit++;
			}
		}
		if (digit >= 2) {
			return true;
		}
		return false;
	}	
}
	
