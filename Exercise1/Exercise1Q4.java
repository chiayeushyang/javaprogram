import java.util.Scanner;

public class Exercise1Q4 {
	
	public static void main(String []args) {
		Scanner kyb = new Scanner(System.in);
		int digit1 = 0, digit2 = 0, digit3 = 0, sum = 0;
		System.out.println("Enter a number between 0 and 1000: ");
		int num = kyb.nextInt();
		
		if (num == 0) {
			System.out.println("The sum of the digits is 1");
		}else if (num == 1000){
			System.out.println("The sum of the digits is 1");
		}else if (num < 100) {
			digit1 = num % 10;
			digit2 = (num /10);
			sum = digit1 + digit2;
			System.out.println("The sum of the " + digit2  + "+" + digit1 + " = " + sum);
		}else {
			digit1 = num % 10;
			digit2 = (num /10)%10;
			digit3 = (num /100);
			sum = digit1 + digit2 + digit3;
			System.out.println("The sum of the " + digit3 +"+"+ digit2 +"+"+ digit1 + "= " + sum);
		}
			
		}
	}

