// getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.
// 이 문제는 클래스의 상속을 구현시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.
// 부모 클래스 --> Person, 자식 클래스 --> Villain, Hero


class Person {
	// Field
	private String name;
	private int age;
	private int height;
	private int weight;
	
	// Constructor
	
	// Method
	public String getName() { return name; }
	public void setName( String name ) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge( int age ) { this.age = age; }
	
	public int getHeight() { return height; }
	public void setHeight( int height ) { this.height = height; }
	
	public int getWeight() { return weight; }
	public void setWeight( int weight ) { this.weight = weight; }
}

class Villain extends Person {}

class Hero extends Person {}

public class Java100_oop_InheritanceSample5 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person p1 = new Person();
		p1.setName( "홍길동" );
		System.out.println( p1.getName() );
		
		Test t1 = new Test();
		t1.setTests1("가나다");
		t1.setTests2("asdf");
		t1.setTesti1(23);
		t1.setTesti2(334);
		System.out.println(t1.getTests1());
		System.out.println(t1.getTests2());
		System.out.println(t1.getTesti1());
		System.out.println(t1.getTesti2());
		
	}
}




class Test {
	private String tests1;
	private int testi1;
	private int testi2;
	private String tests2
	private String str1;
	private String str2;
	private String str3;
	private int qewr;
	private int wwww;
	
	public String getTests1(){return tests1;}
	public void setTests1(String tests1){this.tests1 = tests1;}
	
	public int getTesti1(){return testi1;}
	public void setTesti1(int testi1){this.testi1 = testi1;}
	
	public String getTests2(){return tests2;}
	public void setTests2(String tests2){this.tests2 = tests2;}
	
	public int getTesti2(){return testi2;}
	public void setTesti2(int testi2){this.testi2 = testi2;}
	
	public String getStr1(){return str1;}
	public void setStr1(String str1){this.str1 = str1;}
	
	public String getStr2(){return str2;}
	public void setStr2(String str2){this.str2 = str2;}
	
	public String getStr3(){return str3;}
	public void setStr3(String str3){this.str3 = str3;}
	
	public int getQwer(){return qwer;}
	public void setQwer(int qwer){this.qwer = qwer;}
	
	public int getWwww(){return wwww;}
	public void setWwww(int wwww){this.wwww = wwww;}

	
}
