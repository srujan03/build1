package training;
import java.util.Scanner;

public class ascii {
	
public static void main(String[] args) {
	
	System.out.print("Enter Char : ");
	Scanner s = new Scanner(System.in);
	char chr = s.next().charAt(0);
	int asciiValue = (int)chr;
	System.out.println("The Ascii value of "+chr +" is : "+ asciiValue);
	
}
}
