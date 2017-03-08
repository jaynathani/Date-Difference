import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter date 1(dd-mm-yyyy): ");
		String str1 = reader.next();
		System.out.println("Enter date 2(dd-mm-yyyy): ");
		String str2 = reader.next();
		System.out.println("You entered: " + str1 + " and " + str2);
		
		String[] date1 = str1.split("-");
		int date1_day = Integer.parseInt(date1[0]);
		int date1_month = Integer.parseInt(date1[1]);
		int date1_year = Integer.parseInt(date1[2]);
		
		String[] date2 = str2.split("-");
		int date2_day = Integer.parseInt(date2[0]);
		int date2_month = Integer.parseInt(date2[1]);
		int date2_year = Integer.parseInt(date2[2]);
		
		
		System.out.println("Day of date 1: "+ date1_day);
		System.out.println("Month of date 1: "+ date1_month);
		System.out.println("Year of date 1: "+ date1_year);
		
		System.out.println("Day of date 2: "+ date2_day);
		System.out.println("Month of date 2: "+ date2_month);
		System.out.println("Year of date 2: "+ date2_year);
		
	}

}
