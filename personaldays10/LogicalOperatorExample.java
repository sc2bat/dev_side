package personaldays10;

public class LogicalOperatorExample {

	public static void main(String[] argrs) {
		/**/
		// 논리연산자
		
		// AND
		// & 는 양 옆 두개다 false 연산 후 결과
		// && 앞이 false 라면 뒤에는 연산 안하고 결과 false 도출
		
		// OR
		// | 는 양 옆 둘다 true 연산 후 결과
		// || 는 앞이 true 라면 뒤에는 연산 안하고 true 도출
		int charCode = 'A';
		
		System.out.println("1");
		if ( (charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자입니다"); // 대문자입니다
		}
		
		System.out.println("2");
		if ( (charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자입니다"); // none
		}
		
		System.out.println("3");
		if ( !(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자입니다"); // none
		}
		
		int value = 6;
		
		System.out.println("4");
		if ( (value%2 == 0) | (value%3 == 0)) {
			System.out.println("2 또는 3의 배수입니다"); // 2 또는 3의 배수입니다
		}
		
		System.out.println("5");
		if ( (value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 또는 3의 배수입니다"); // 2 또는 3의 배수입니다
		}
		
		
		

	}

}
