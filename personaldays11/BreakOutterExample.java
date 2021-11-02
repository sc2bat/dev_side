package personaldays11;

public class BreakOutterExample {

	public static void main(String[] argrs) {
		/**/
		// 중첩된 반복문 break 
		// 바깥쪽 반복문에 이름(라벨)을 붙이고 break.이름; 사용
		Outter:for(char upper= 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 종료");

	}

}
