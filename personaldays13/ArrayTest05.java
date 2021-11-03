package personaldays13;

import java.util.Scanner;

public class ArrayTest05 {

	public static void main(String[] argrs) {
		/**/
		//
		Scanner sc = new Scanner(System.in);
		
		int [] scores = new int [3];
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d] > ", i);
			scores[i] = sc.nextInt();
		}
		for (int k : scores) {
			System.out.printf("scores[%d]", k);
		}

	}

}
