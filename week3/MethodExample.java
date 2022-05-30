public class MethodExample{ 

	// public static void main(String[]args){
		// displayResults();
		// displayResults(3);
		// int result = sum(4,5);
		// displayResults(result);
		// displayResults(sum(2,6));
		// int num = 3; //local variable
		// System.out.println(calculate(num)); //3 passed by value
		// System.out.println(num);
	// }
	
	// public static void displayResults(){
		// System.out.println("My first method");
	// }
	
	// public static void displayResults(int result){
		// System.out.println("Results is: " + result);
	// }
	
	// public static int sum(int num1, int num2) {
		
		// return num1+num2;
	// }
	
	// public static int calculate(int num){ // 3 // local variable
		// System.out.println("calculate" + num);
		// num += 5; //num = num + 5 // num = 3 + 5;
		// System.out.println("calculate" + num);
		// return num;
	// }
	
	/*====================== Method Overloading ========================= use same method name with different parameter */
	
	// public static void main (String[]args){
		// displayResults();
		// displayResults(1);
		// displayResults(1, 3.2);
		// displayResults(1.5, 3);
		
	// }
	
	// public static void displayResults(){
		// System.out.println("displayResults()");
	// }
	
	// public static void displayResults(int num){
		// System.out.println("displayResults(int num)");
	// }
	// public static void displayResults(int num, double num2){
		// System.out.println("displayResults(int num, double num2)");.,    
	// }
	// public static void displayResults(double num, int num2){
		// System.out.println("displayResults(double num, int num2)");
	// }
	
	public static void main (String [] args) {
		MyMethod.sum(6, 8); // ClassName .methodName(); <- static method
		// MyMethod.multiply(6,8); //compile error- not public method 
		// MyMethod.division(6,8); //compile error- not static method 
		new MyMethod().division(6,8);
		MyMethod my = new MyMethod();
		my.division(6,8);
		MyMethod.half(6);
		//ClassName objRefVar = new ClassName();
		//objRefVar.methodName();
		}
}



class MyMethod {

		public static void sum(int num1, int num2){
			System.out.println("Sum is" + ((double)num1 + num2));
		}
		private static void multiply(int num1, int num2) {
			System.out.println("Multiply is" + (num1 * num2));
		}
		public void division (int num1, int num2){
			System.out.println("Division is " + (num1/ num2));
		}
		
		public static double half(double num)
		{
			double result = num / 2.5;
			return result;
		}

		
	}