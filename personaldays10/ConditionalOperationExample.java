package personaldays10;

public class ConditionalOperationExample {

	public static void main(String[] argrs) {
		/**/
		// 삼항 연산자 ?:
		// 세 개의 피연산자를 필요로하는 연산자
		//? 앞의 조건식에 따라 콜론: 앞뒤의 피연산자가 선택된다고 해서 조건 연산식이라고 부름
		// 조건식 ? 값 또는 연산식 : 값 또는 연산식 
		// 피연산자1 // 피연산자2	// 피연산자3
		// 피연산자1 피연산자2 true
		// 피연산자1 피연산자3 false
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' ); 
		System.out.printf("%d 점은 %s 등급입니다", score, grade); // 85 점은 B 등급입니다
		
	}

}
