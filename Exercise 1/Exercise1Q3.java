import java.util.Scanner;
public class Exercise1Q3{
	
	//Question 3a
	// public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// double π = Math.PI;
		// System.out.println("Please input the radius");
		// double radius = input.nextDouble();
		
		// double perimeter = 2 * radius * π;
		// double area = radius * radius * π;
		// System.out.println("Area = " + area);
		// System.out.println("Perimeter = " + perimeter);
		

	// }
	
	//Question 3b
	// public static void main(String[] args){
		// Scanner input = new Scanner(System.in);
		// System.out.println("Please input three test scores ");
		// double score1, score2, score3, sum = 0, avg = 0;
		// score1 = input.nextDouble();
		// score2 = input.nextDouble();
		// score3 = input.nextDouble();
		// sum = score1 + score2 + score3;
		// avg = sum / 3;
		// System.out.println("Average of" + "\n" + score1 + "\n" + score2 + "\n" +score3 + "\t=\t" +avg);
		
	// }

	
	//Question 3c
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the retail price");
		double retailPrice = input.nextDouble();
		double profit = retailPrice * 0.4;
		System.out.println(profit);
	}
	
}
