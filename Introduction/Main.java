package Basics;
import java.util.Scanner;
public class Main { //class

    public static void main(String[] args) { //method

        // System.out.println(arg) prints the value of arg on a new line
        // System.out.print(arg) prints the value of arg

        // primitive data types
        int hello = 9;            // integer
        System.out.println(hello);

        double num2 = 5.0;        // for numbers with decimal points
        System.out.println(num2);

        boolean b = false;        // takes only two values i.e. false and true
        System.out.println(b);

        char c = 'h';            // character for single characters
        System.out.println(c);

        // non-primitive data types
        String str = "paras";    // string for more than one character
        System.out.println(str);


        // assignment of variables
        int temp = hello;
        System.out.println(temp);
        // as both the variables have the same data type they can be assigned to each other

        // int temp_2 = str
        // if you uncommented above comment then it will give you error as both the variables are of different data type


        // Operators
        int a = 3 , h = 4;
        double dob = 2.0;

        int sum = a + h;
        System.out.println(sum);

        int diff= a - h;
        System.out.println(diff);

        int mul = a * h;
        System.out.println(mul);

        double div = a / dob;
        System.out.println(div);

        // one variable must be double for answer in double data type otherwise it will be integer but converse of this is not true
        // ,or we can just typecast one variable like below

        double div_2 = a/(double)h;
        System.out.println(div_2);

        double pow = Math.pow(a,h);
        System.out.println(pow);

        int mod = 56 % 5;
        System.out.println(mod);


        // Inputs and Scanners
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int abs=Integer.parseInt(s);
        System.out.println(abs);

    }

}
