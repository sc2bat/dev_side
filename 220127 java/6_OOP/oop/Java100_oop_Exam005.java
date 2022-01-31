// 클래스에서 생성자란 무엇이고 어떤 특징을 갖고 있는지 말해보시오.
// 이 문제는 클래서에서 생성자의 개념과 역할, 특징 등에 대해서 알고 있는지를 묻는 문제이다.


// [1] : 생성자(Constructor)
// 생성자는 new 키워드로 클래스의 객체(또는 인스턴스)가 생성될 때 제일 먼저 자동적으로 호출되는 특별한 메서드이다.
// 따라서, 객체의 초깃값을 설정하는 등의 용도로 많이 사용된다.
// 생성자명은 클래스명과 동일하게 만든다.
// 생성자는 리턴되는 반환값이 없다. --> 객체가 생성될 때 제일 먼저 호출만 된다.
// 생성자는 오버로딩이 가능하다.
// 생성자는 default 생성자란게 있다. --> 클래스내에 생성자가 없다면 default 생성자가 자동 호출 --> 클래스명과 동일하고, 받는 인자값 X.


// [2] : 생성자 위치
// 보통 속성과 메서드 사이에 기술한다.
// 생성자도 메서드이므로 메서드 그룹에 속하는데 제일 상단에 보통 위치한다.


// [3] : 예
class Person {
	
	// [1] : 속성(Attribute)
	int age;
	String name;
		
	// [2] : 생성자(Constructor)
	Person() {  }
	
	// [3] : 메서드(Method)
	void move() {
		System.out.println( "Person is moving." );
	}
	
}


/*
public class test(){
	private test(){}
	private static test itc = new test();
	public static test getInstance(){return itc;}
}
*/































