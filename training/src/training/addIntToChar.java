package training;
import java.util.Scanner;
public class addIntToChar {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Int value : ");
	int I = s.nextInt();
	System.out.println("Enter a Char value : ");
	char Chr = s.next().charAt(0);
	Chr = (char)(Chr+I);
	
	System.out.println("New char = "+Chr);
	
}
}
