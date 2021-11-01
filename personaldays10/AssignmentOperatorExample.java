package personaldays10;

public class AssignmentOperatorExample {

	public static void main(String[] argrs) {
		/**/
		// 대입연산자
		
		// 대입연산자는 가장 낮은 연산 순위를 가지고 있기에 제일 마지막에 수행됨
		// 연산의 진행방향이 오른쪽에서 왼쪽으로 
		/*
		a = b = c = 5;
		1 c = 5
		2 b = c
		3 a = b
		*/
		
		int result = 0;
		
		result += 10;
		System.out.println("result = " + result); // result = 10
		
		result -= 5;
		System.out.println("result = " + result); // result = 5
		
		result *= 3;
		System.out.println("result = " + result); // result = 15
		
		result /= 5;
		System.out.println("result = " + result); // result = 3
		
		result %= 3;
		System.out.println("result = " + result); // result = 0

	}

}
