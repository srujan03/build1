package training;
import java.util.Scanner;
public class doubleToInt {
public static void main(String[] args) {
	System.out.print("Enter a Double Value");
	Scanner s = new Scanner(System.in);
	double D = s.nextDouble();
	int I = (int)D;
	System.out.println(D+" ==> "+I);
	
}
}
