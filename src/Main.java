
// Created by Virginia Cordero on July 2018

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		// Capturing first date
		System.out.println("Please capture first date with format 'yyyy-MM-dd':");
		String dateFromString = scanner.nextLine();
		Date dateFrom = new Date();

		// Trapping invalid date format
		try {
			dateFrom = formatter.parse(dateFromString);
		} catch (ParseException e) {
			System.out.println("Invalid format");
			return;
		}

		// Capturing second date
		System.out.println("Please capture second date with format 'yyyy-MM-dd':");
		String dateToString = scanner.nextLine();
		Date dateTo = new Date();

		scanner.close();

		// Trapping invalid date formats
		try {
			dateTo = formatter.parse(dateToString);
		} catch (ParseException e) {
			System.out.println("Invalid format");
			return;
		}

		// Creating calendars from dates
		Calendar calendarFrom = Calendar.getInstance();
		Calendar calendarTo = Calendar.getInstance();
		calendarFrom.setTime(dateFrom);
		calendarTo.setTime(dateTo);

		// Comparing days in calendar
		int fromDay = calendarFrom.get(Calendar.DAY_OF_YEAR);
		int toDay = calendarTo.get(Calendar.DAY_OF_YEAR);
		int dayDifference = fromDay - toDay;
		System.out.println("Day difference is: " + Math.abs(dayDifference));

		// Comparing months in calendar
		int fromMonth = calendarFrom.get(Calendar.MONTH);
		int toMonth = calendarTo.get(Calendar.MONTH);
		int monthDifference = fromMonth - toMonth;
		System.out.println("Month difference is: " + Math.abs(monthDifference));

		// Comparing years in calendar
		int fromYear = calendarFrom.get(Calendar.YEAR);
		int toYear = calendarTo.get(Calendar.YEAR);
		int yearDifference = fromYear - toYear;
		System.out.println("Year difference is: " + Math.abs(yearDifference));
	}
}
