package personaldays09;

import java.util.Random;

public class sudoku04 {

	public static void main(String[] argrs) {
		/**/
		Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		int i = rd.nextInt();
		if(i < 0)i *= -1;
		i = i % 9 + 1;
		System.out.printf("랜덤 %d \t\n", i);
		
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		System.out.printf("a[i] 의 값 %d \t\n", a[i]);
		
		//int [][] b = new int [9][9];
		
//		int sum = 0;
//		for(int i = 1; i <= 9; i++)sum = sum +i;
//		System.out.printf("1부터의 9까지의 합 = %d ", sum);
		//1부터의 9까지의 합 = 45 
		
		// a[i]에서 하나를 뽑고 45에서 빼고 빼고해서 0이 되게끔 배치
		/*
		int k = 45;
		while(k != 0) {
			k = k - a[i];
			System.out.printf("%d \t", k);
		} */
		// a[i] 값이 하나로 고정됨
		// a[i] 값으로 k가 0이 되지 않으면 무한 반복함

	}

}
