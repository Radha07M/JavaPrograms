package LeetCode;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import org.testng.annotations.Test;

public class DateDiffCalculator {

	@Test
	public void dateDiffernceCalculator() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Date");
		String startDate = sc.next();
		System.out.println(startDate);
		String[] startArr = startDate.split("/");
		int startYear = Integer.parseInt(startArr[2]);
		int startMonth = Integer.parseInt(startArr[1]);
		int startday = Integer.parseInt(startArr[0]);
		
		System.out.println("Enter End Date");
		String endDate = sc.next();
		System.out.println(endDate);
		String[] endArr = endDate.split("/");
		int endYear = Integer.parseInt(endArr[2]);
		int endMonth = Integer.parseInt(endArr[1]);
		int endDay = Integer.parseInt(endArr[0]);
		
		LocalDate firstDate = LocalDate.of(startYear, startMonth, startday);
		LocalDate secondDate = LocalDate.of(endYear, endMonth, endDay);
		
		Period diff = Period.between(firstDate,secondDate);
		
		System.out.println("Difference is: Year= "+diff.getYears()+" ,Month= "+diff.getMonths()+" ,Days="+diff.getDays());
	}

}
