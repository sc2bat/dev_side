package personaldays13;

public class EnumMethodExample {

	public static void main(String[] argrs) {
		/**/
		//
		// naem() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		// SUNDAY
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		// 6
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WENSEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1); // -2
		System.out.println(result2);  // 2
		
		
		String[] args = new String[7];
		//valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말");
			}else {
				System.out.println("평일");
			}
		}
		
		//values() 메소드
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		} 
		// 
//		MONDAY
//		TUESDAY
//		WENSEDAY
//		THURSDAY
//		FRIDAY
//		SATURDAY
//		SUNDAY
		
	}

}
