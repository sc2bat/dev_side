package personaldays09;

import java.util.Random;

public class sudoku01 {

	public static void main(String[] argrs) {
		/**/
		Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		
		int [] a = new int [9];
		int i, j;
		
		for(i = 0; i < a.length; i++) {
			//int [] k = new int [9]; rd.nextInt();
			a[i] = rd.nextInt();
			if(a[i] <= 0) a[i] *= -1;
			a[i] = a[i] % 10;
			if(a[i] == 0)a[i] +=1;
			for(j = 0; j < i; j++)
				if(a[i] == a[j])break;
			if(i != j)i--;
			
		}
		//System.out.println(a[0] + " " + a[1] + " " + a[3]);
		//System.out.printf("0 [%d] \t1 [%d] \n", a[0], a[1]);
		
		System.out.println();
		for(int k : a) {
			System.out.print(k + " "); // 1 2 3 4 5 
		}
		
		
		
		
		
		
		

	}

}
