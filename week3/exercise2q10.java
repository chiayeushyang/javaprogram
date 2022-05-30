import java.util.Scanner;

public class exercise2q10 {
	
	public static void main (String [] args) {
		Scanner kyb = new Scanner(System.in);
		System.out.println ("Please enter three floating-point numbers");
		System.out.print ("\n First number = ");
		float num1 = kyb.nextFloat();
		System.out.print ("\n Second number = ");
		float num2 = kyb.nextFloat();
		System.out.print ("\n Third number = ");
		float num3 = kyb.nextFloat();
		System.out.println ("The smallest value = " + min_value(num1,num2,num3));
	
	}
	
	public static float min_value(float num1, float num2, float num3) {
			float min = Math.min(num3,(Math.min(num1, num2)));
			return min;
	}	
}