package personaldays13;

import java.util.Scanner;

public class days8ControllOpWhile03 {

	public static void main(String[] argrs) {
		/**/
		//정수를 입력 받아서 팩토리얼
		// 6! = 6x 5x ... = oo
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int i = sc.nextInt();
		int k = 1;
		System.out.printf("%d! = %d", i, i);
		int t = 1;
		for (int j = 1; j <= i; j++) {
			t *= j;
		}
		while(k < i) {
			i--;
			System.out.printf(" x %d", i);
		}
		System.out.printf(" = %d ", t);

	}

}
