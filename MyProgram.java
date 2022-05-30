import java.util.Scanner;

public class MyProgram{
	
	public static void main (String [] args){
		
		int i;
		i = 9; 
		System.out.println(i + 5);
		System.out.println(i);
		int a = i + 9 ;
		System.out.println(a);
		System.out.println("Number = "  +  i + i );
		System.out.println("Number = "  +  (i + i));
		float o = 9.997f; // need put f on the end 
		double _p = 9.997;
		System.out.println(o);
		System.out.println(_p);
		byte b = 127; // max 127
		String h = "Lkjlkj";
		//ClassName objRefVar = new ClassName();
		String name = new String ("NULL");
		char grade= 'L';
		System.out.println(h);
		System.out.println(grade);
		
		
		Scanner input = new Scanner(System.in);
		String subject = "Programming";
		String name2 = "Alice Tan";
		System.out.println(name + "study" + subject); 
		System.out.println("Enter your name ");
		name2 = input.nextLine(); // read string value
		System.out.println(name2 + "study " + subject);
		System.out.println("Enter your age");
		int age = input.nextInt(); // read int value 
		System.out.println(name2 + " was " + age + " age"); 
		System.out.println("Length of name    = " + name.length());
	}
} 

//javac MyProgram.java  (compile to .class file