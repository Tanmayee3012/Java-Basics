package tutorial_1;

public class Main { //class

	public static void main(String[] args) { //method
		
		// primitive data types
		int hello = 9;			// integer
		double num2 = 5.0;		// for numbers with decimal points
		boolean b = false;		// takes only two values i.e. false and true
		char c = 'h';			// character for single characters
		
		// non-primitive data types
		String str = "paru";	// string for more than one characters
		
		// System.out.println(arg) prints the value of arg on a new line
		// System.out.print(arg) prints the value of arg
		
		System.out.println(hello);
		System.out.println(num2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		
		// assignment of variables
		int temp = hello;	
		System.out.println(temp);
		// as both the variables have the same data type they can be assigned to each other
		
		// int temp = str 
		// if you uncommented above comment then it will give you error as both the variables are of different data type
		// I hope you get what I am trying to say
		
	}

}
