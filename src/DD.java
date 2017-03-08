import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter date 1(dd-mm-yyyy): ");
		String str1 = reader.next();
		System.out.println("Enter date 2(dd-mm-yyyy): ");
		String str2 = reader.next();
		System.out.println("You entered: " + str1 + " and " + str2);
	}

}
