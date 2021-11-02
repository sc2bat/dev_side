package personaldays11;

public class chapter04 {

	public static void main(String[] argrs) {
		/**/
		//
		// Exercise05
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10 ; y++) {
				if(4*x + 5*y == 60)
					System.out.printf("(%d, %d)\n", x, y);
			}
		}
		
		System.out.println();
		
		//Exercise04
		int a = 0;
		int b = 0;
		while(a + b != 5) {
			a = (int)(Math.random()*6+1);
			b = (int)(Math.random()*6+1);
			System.out.printf("(%d, %d)\n", a, b);
		}

	}

}
