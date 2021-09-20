package training;
import java.util.Scanner;
public class addDoubleAndInt {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a Dobule Value: ");
	double Sum,D = s.nextDouble();
	System.out.print("Enter a Int Value: ");
	int I = s.nextInt();
	Sum = D + I;
	System.out.println(D+" + "+I+" = "+Sum);
}
}
