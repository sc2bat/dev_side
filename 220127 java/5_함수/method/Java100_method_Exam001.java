// 메서드의 정의와 기본적인 자바의 메서드를 작성해보시오.
// 이 문제는 자바의 메서드 개념과 메서드가 가지는 여러 특징들에 대해서 알고 있는지를 묻는 문제이다.


// [1] : 메서드란 무엇인가?
// (1) 메서드는 다른 언어에서의 함수와 마찬가지로 어떤 특정한 동작이나 처리를 하도록 만들어진 코드 단위이다.
// (2) 반복적인 작업을 처리해야 하는 경우 메서드로 만들어놓으면 이후에 필요할 때 다시 재사용할 수 있어서 아주 유용하다.
// (3) 메서드는 호출시 어떤 결과를 반환하기도 하지만, 결과를 반환하지 않는 메서드도 있다.
// (4) 메서드는 호출시 어떤 인자 값들을 넘겨서 호출하는 경우도 있지만, 인자 값 없이 호출하는 경우도 있다.


// [2] : 메서드 종류 --> 크게 4가지 유형
// (1) 반환값 --> X 		받는 인자값 --> X 
// (2) 반환값 --> X 		받는 인자값 --> O 
// (3) 반환값 --> O 		받는 인자값 --> X 
// (4) 반환값 --> O 		받는 인자값 --> O


public class Java100_method_Exam001 {
	
	public static void helloWorld() {
		System.out.println( "Hello, World~" );
	}
	
	public static void showMenu() {
		System.out.println( "showMenu() 메서드가 호출되었습니다." );
	}
	
	public static void test(String s){
		System.out.println(s);
	}
	
	public static int qwer(int a){
		a = a + 1;
		return a;
	}
	
	public static void main(String[] args) {
		
		// [1] : 반환값 --> X 		받는 인자값 --> X 
		showMenu();
		helloWorld();
		
		String s = "가나다";
		test(s);
		s = "테스트";
		test(s);
		
		int t = 3;
		int e = qwer(t);
		int q = qwer(3);
		System.out.println(q);
		System.out.println(e);
		
	}
	
}





































