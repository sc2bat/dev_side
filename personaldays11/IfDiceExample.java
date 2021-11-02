package personaldays11;

public class IfDiceExample {

	public static void main(String[] argrs) {
		/**/
		//0.0 <= Math.random() < 1.0
		//0.0 * 10(0.0) <= Math.random() * 10 < 1.0 * 10 (10.0)
		// int 0.0 -> 0 <= (int)(Math.random()*10) < int 10.0 -> 10
		// 0 + 1 <= (int)(Math.random()*10) + 1 < 10 + 1
		
		int num = (int)(Math.random()*6) +1;
		//System.out.printf("%d\n", num);
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}

	}

}
