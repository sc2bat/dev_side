package personaldays13;

import java.util.Scanner;

public class days8ControllOpWhile01 {

	public static void main(String[] argrs) {
		/**/
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		
		int input = sc.nextInt();
		
		while(input != 3) {
			System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
			if(input == 3)System.out.printf("프로그램을 종료합니다");
		}

	}

}
