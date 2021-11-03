package personaldays13;

import java.util.Random;

public class days8ControllOpWhile05 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Random rd = new Random();
		int num = rd.nextInt();
		//System.out.println(num);
		
		int i = 0;
		while(i<10) {
			num = rd.nextInt();
			if(num < 0)num*=-1;
			num = num % 10 + 1;
			System.out.printf("%d \n", num);
			i++;
		}

	}

}
