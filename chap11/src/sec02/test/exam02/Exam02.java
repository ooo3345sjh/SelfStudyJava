package sec02.test.exam02;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			case Calendar.SUNDAY:
				strWeek = "��";
				break;
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == cal.get(Calendar.AM)) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.print(hour + "�� ");
		System.out.println(minute + "��");
	}

}
