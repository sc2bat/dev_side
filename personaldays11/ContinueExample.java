package personaldays11;

public class ContinueExample {

	public static void main(String[] argrs) {
		/**/
		// continue 일반적으로 if문과 함께 사용
		// 특정 조건을 만족하면 continue 를 실행 반복문을 종료하지 않고 이어나감
		for (int i = 0; i <= 10; i++) {
			if(i%2 != 0	) {
				continue;
			}
			System.out.println(i);
		}

	}

}
