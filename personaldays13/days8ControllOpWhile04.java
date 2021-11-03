package personaldays13;

import java.util.Scanner;

public class days8ControllOpWhile04 {

	public static void main(String[] argrs) {
		/**/
		Scanner sc = new Scanner(System.in);
		//단 출력
//		System.out.printf("정수입력");
//		int dan = sc.nextInt();
//		
//		int i = 1;
//		while(i < 10) {
//			System.out.printf("%d x %d = %d \n", dan, i , dan *i);
//			i++;
//		}
		
		System.out.printf("출력할 단을 입력하세요 : - (종료 0)");
		int input = sc.nextInt();
		int i = 0;
		
		while(input != 0) {
			while (i < 9) {
				i++;
				System.out.printf("%d x %d = %d\n", input, i, input *i);
			}
			System.out.printf("출력할 단을 입력하세요 : - (종료 0)");
			input = sc.nextInt();
		}
		
		

	}

}
