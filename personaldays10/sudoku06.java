package personaldays10;

import java.util.Random;

public class sudoku06 {

	public static void main(String[] argrs) {
		/**/
		Random rd = new Random();
		//Scanner sc = new Scanner(System.in);
		//
		int [][] a = {
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},
				{1, 2, 3, 4, 5, 6, 7, 8 ,9},					
				};
		
//		int [] b = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
		
		//int k = 0;
//		int [] c = new int [9];
//		for(int i = 0; i < b.length; i++) {
//			//k++;
//			//System.out.println(k + " " + i);
//			System.out.printf("%d \t", b[i]);
//			System.out.println();
//			c[i] = b[i];
//			System.out.printf("%d \t", c[i]);
//			
//		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = rd.nextInt();
				if(a[i][j] < 0) a[i][j]*= -1;
				a[i][j] = a[i][j] % 10;
				if(a[i][j] == 0) a[i][j]+=1;
				
			}
				
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.printf("%d \t", a[i][j]);  
			System.out.println();
		}
		System.out.println();
		
		
//		7 	5 	5 	9 	2 	2 	1 	1 	7 	
//		2 	3 	1 	2 	6 	5 	2 	7 	4 	
//		3 	6 	1 	4 	2 	2 	6 	6 	1 	
//		2 	5 	2 	2 	4 	1 	2 	1 	4 	
//		5 	1 	1 	6 	9 	7 	1 	2 	6 	
//		2 	4 	7 	9 	6 	2 	3 	7 	2 	
//		6 	6 	3 	9 	4 	3 	2 	9 	1 	
//		6 	9 	1 	1 	2 	2 	1 	8 	9 	
//		5 	2 	1 	6 	2 	9 	7 	8 	5 	
		
		
		
		
		
		
		
		
		

	}

}
