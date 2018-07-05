// Created by Virginia Cordero on July 2018

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		runTask();
	}

	public static void runTask() {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		// User introduction to the program
		System.out.println("-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-");
		System.out.println("For the next exercise, you will be asked to enter two dates (one at a time).\n"
				+ "Please consider that both dates should:\n" + "-Be formatted as 'yyyy-MM-dd'\n");

		// Capturing first date
		System.out.println("Please capture the first date with format 'yyyy-MM-dd':");
		String dateFromString = scanner.nextLine();
		Date dateFrom = new Date();

		// Converting string to date and trapping invalid date format
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

		// Converting string to date and trapping invalid date format
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
