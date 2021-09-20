package training;
import java.util.Scanner;

public class intro {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name = x.nextLine();
	System.out.println("Enter your Roll Number : ");
	int roll = x.nextInt();
	System.out.println("Enter your Field of interest : ");
	String FoI = x.nextLine();
	
	System.out.println("Hey, my name is "+name+", my roll number is "+roll+". My field of interest are "+FoI);
	
}
}
