public class Test
{
	public static void main(String[]args){
		System.out.println(Calculate.average(3,0, 7));
	}	
}

class Calculate {
	
	public static float average (int num1, int num2){
		return ((float)(num1+num2))/2;
	}
	
	public static float average (int num1, int num2, int num3){
		return ((float)(num1+num2+num3))/3;
	}
	
	
}