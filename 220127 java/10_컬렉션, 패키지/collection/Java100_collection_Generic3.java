// 제네릭(Generic) 개념과 사용법을 예제 코드로 구현해보시오.
// 이 문제는 자바 문법중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지를 묻는 문제이다.


class Sample<T> {
	private T obj;
	Sample( T x ) { this.obj = x; }
	T getObj() { return obj; }
	void printInfo() { System.out.println( obj.getClass().getName() ); }
}

public class Java100_collection_Generic3 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성 --> String
		Sample<String> s1 = new Sample<String>( "안녕하세요~" );
		System.out.println( s1.getObj() );
		s1.printInfo();
		System.out.println( "-------------------------------" );
		
		// [2] : 객체 생성 --> Integer
		Sample<Integer> s2 = new Sample<Integer>(100);
		System.out.println( s2.getObj() );
		s2.printInfo();
		System.out.println( "-------------------------------" );
		
		// [3] : 형변환 없이 사용하기
		// String str = s1.getObj();
		// System.out.println( str.length() );  			// 6
		System.out.println( s1.getObj().length() );  		// 6
		System.out.println( s2.getObj() + 100 );			// 200
		
		
		System.out.println("테스트");
		Test<String> t1 = new Test<String>("테스트");
		System.out.println(t1.getQwer());
		t1.printInfo();
		
	}
}


class Test<T>{
	private T qwer;
	Test(T x){this.qwer = x;}
	
	T getQwer(){return qwer;}
	void printInfo(){
		System.out.println(qwer.getClass().getName());
	}
}




















