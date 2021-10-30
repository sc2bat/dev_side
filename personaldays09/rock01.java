package personaldays09;

import java.util.Random;
import java.util.Scanner;

public class rock01 {

	public static void main(String[] argrs) {
		/**/
		//
		Scanner sc = new Scanner(System.in);
		// 가위바위보 이길때까지
		// 끝나면 야구게임 이길때까지
		
		// 가위 바위 보 구현
		
		// 랜덤 import
		Random rd = new Random();
		
		// 랜덤 int 하나
		//int [] com_a = rd.nextInt();
		/*
		int com = rd.nextInt();
		int [] com_a = new int[3];
		int i, j;
		
		//랜덤 int com_a 양수로
		// 1 2 3 만 출력되게
		for(i = 0; i <= 2; i++) {
			com_a[i] = rd.nextInt();
				if(com_a[i] <= 0) 	com_a[i] *= -1;
					com_a[i] = com_a[i] % 3+1;
				for(j = 0; j <= i; j++)
					if(com_a[i] == com_a[j])break;
				if(i != j) i--;
				//System.out.println(com_a[i]); // 1, 2, 3 이 다 출력될때까지 반복
		}
		System.out.printf("[%d] [%d] [%d]\n", com_a[0], com_a[1], com_a[2]);
		System.out.println();
		
		// 랜덤하게 
		
		System.out.printf("%d \n", com);
		System.out.println();
		*/
		// 1 가위 2 바위 3 보	
		/*
		int com1, com2, r;
		
		r = rd.nextInt();
		if(r < 0) r *= -1;
		r = r % 3 +1;
		System.out.printf("%d \n", r);
		
		//com1, com2 = (int)r;
		
		com1 = r;
		com2 = r;

		System.out.printf("%d \n", com1);
		System.out.printf("%d \n", com2);
		*/
		// 같은 값만 나옴

		int input;
		do {
			System.out.printf("가위바위보 게임 : \n");
			System.out.printf("1 시작 2 종료 \n");
			input = sc.nextInt();		
			
			int com_a, com_b;
			
			com_a = rd.nextInt();
			if(com_a < 0) com_a *= -1;
			com_a = com_a % 3 + 1;
			//System.out.printf("%d \n", com_a);
			System.out.println();
			
			com_b = rd.nextInt();
			if(com_b < 0) com_b *= -1;
			com_b = com_b % 3 + 1;
			//System.out.printf("%d \n", com_b);
			
			
			//
//			switch(com_a) {
//			case 1 : System.out.println("A 가위");
//			case 2 : System.out.println("A 바위");
//			case 3 : System.out.println("A 보");
//			}
//			switch(com_b) {
//			case 1 : System.out.println("\t B 가위");
//			case 2 : System.out.println("\t B 바위");
//			case 3 : System.out.println("\t B 보");
//			}
			{
			if(com_a == 1) System.out.println("A 가위");
			else if (com_a == 2) System.out.println("A 바위");
			else System.out.println("A 보");
			}
			
			{
			if(com_b == 1) System.out.println("B 가위");
			else if (com_b == 2) System.out.println("B 바위");
			else System.out.println("B 보");
			}
			
			// 가위바위보 결과
			int k;
			k = com_a - com_b + 3;
			// 1 3 1
			// 2 3 2
			// 3 3 3 
			// 1 1 3
			// 2 1 4
			// 3 1 5
			// 1 2 2
			// 2 2 3
			// 3 2 4
			
//			switch(k) {
//			case 1 : System.out.println("졌습니다");
//			case 2 : System.out.println("이겼습니다");
//			case 3 : System.out.println("비겼습니다");
//			case 4 : System.out.println("졌습니다");
//			case 5 : System.out.println("이겼습니다");			
//			}
			
			switch(k) {
			case 1 : case 4 : System.out.println("졌습니다"); break;
			case 2 : case 5 : System.out.println("이겼습니다"); break;
			case 3 : System.out.println("비겼습니다");
			}
		}while(input != 2);
		
		// 
//		A 가위
//		A 바위
//		A 보
//			 B 바위
//			 B 보
//		이겼습니다
//		비겼습니다
//		졌습니다
//		이겼습니다
		
		System.out.println("종료");
			
			
			
			

	}

}
