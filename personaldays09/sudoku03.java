package personaldays09;

import java.util.Random;

public class sudoku03 {

	public static void main(String[] argrs) {
		/**/
		Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		// 3 x 3 스도쿠
		
		int [][] a = new int [3][3];
		int i, j = 0, k = 1;
//		
//		for(i = 0; i < a.length; i++) {
//			for(j = 0; j < a[i].length; j++) {
//				a[i][j] = k++;				
//			}
//		}
		
		
		for(i = 0; i < a.length; i++) {
			a[i][j] = rd.nextInt();
			if(a[i][j] <= 0) a[i][j] *= -1;
			a[i][j] = a[i][j] % 10;
			if(a[i][j] == 0)a[i][j] +=1;
			for(j = 0; j < i; j++)
				if(a[i][j] == a[i][j])break;
			if(i != j)i--;
		}

		for(int [] rowAddr : a) {
			for(int colValue : rowAddr) {
				System.out.printf("%d\t ", colValue);
			}
			System.out.println();
		}

	}

}
