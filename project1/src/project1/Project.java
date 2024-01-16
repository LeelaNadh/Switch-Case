package project1;
import java.util.Scanner;
public class Project {	
 public static void main(String arg[]){
		
	 dates();
//	 days();
	}
 public static String dates() { 
	 Scanner reader = new Scanner(System.in);
	 System.out.print("Enter a number between 1 to 7 : ");
	 int n = reader.nextInt();
		switch (n) {
		case 1:
		    System.out.println("monday");
		    break;
		case 2:
			System.out.println("tuesday");
			 break;
		case 3:
			System.out.println("wednesday");
			 break;
		case 4:
			System.out.println("thursday");
			 break;
		case 5:
			System.out.println("friday");
			 break;
		case 6:
			System.out.println("saturday");
			 break;
		case 7:
		    System.out.println("sunday");
		    break;		
		}
	 return null;
 }; 
 public static String days() {
	// your code
	 return null;
 } 
}
