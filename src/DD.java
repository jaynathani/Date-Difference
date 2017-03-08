import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		
		System.out.println("Enter two dates, date2 > date1.");
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter date 1(dd-mm-yyyy): ");
		String str1 = reader.next();
		
		String[] date1 = str1.split("-");
		int date1Day = Integer.parseInt(date1[0]);
		int date1Month = Integer.parseInt(date1[1]);
		int date1Year = Integer.parseInt(date1[2]);
		
		
	/*  System.out.println("Day of date 1: "+ date1Day);
		System.out.println("Month of date 1: "+ date1Month);
		System.out.println("Year of date 1: "+ date1Year);*/	
		
		System.out.println("Enter date 2(dd-mm-yyyy): ");
		String str2 = reader.next();
//		System.out.println("You entered: " + str1 + " and " + str2);
		
		String[] date2 = str2.split("-");
		int date2Day = Integer.parseInt(date2[0]);
		int date2Month = Integer.parseInt(date2[1]);
		int date2Year = Integer.parseInt(date2[2]);
				
	/*	System.out.println("Day of date 2: "+ date2Day);
		System.out.println("Month of date 2: "+ date2Month);
		System.out.println("Year of date 2: "+ date2Year);*/
		
		int dayDiff, monthDiff, yearDiff;
		
		yearDiff = date2Year - date1Year;
		monthDiff = date2Month - date1Month;
		if(monthDiff < 0){
			monthDiff = monthDiff + 12;
			yearDiff--;
		}
		dayDiff = date2Day - date1Day;
		if(dayDiff < 0){
			if(date1Month == 1 || date1Month == 3 || date1Month == 5 || date1Month == 7 || date1Month == 8 || date1Month == 10 || date1Month == 12){
				dayDiff = dayDiff + 31;
			}
			else if(date1Month == 2){
				if(date1Year % 4 == 0)
					dayDiff = dayDiff + 29;
				else
					dayDiff = dayDiff + 28;
			}
			else{
				dayDiff = dayDiff + 30;
			}
			monthDiff--;
		}
	/*	System.out.println("Day difference: "+ dayDiff);
		System.out.println("Month difference: "+ monthDiff);
		System.out.println("Year difference: "+ yearDiff);*/
		
		System.out.println("Difference is "+ dayDiff +" day(s) " + monthDiff + " month(s) " + yearDiff + " year(s).");
		
	}

}
