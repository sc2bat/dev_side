package personaldays13;

import java.util.Calendar;// Calnedar 클래스는 java.util 패키지에 있음 import 해야함

public class EnumWeekExample {

	public static void main(String[] argrs) {
		/**/
		//
		//Calendar
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 일 1 ~ 토 7 값을 리턴
		//System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WENSEDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바 공부를 합니다");
		}

	}

}
