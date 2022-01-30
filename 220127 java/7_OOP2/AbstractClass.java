
abstract class Animal{
	/*
	abstract void cry(){
		System.out.println("테스트");
	}
	*/
	abstract void cry();
}

class Dog extends Animal{
	void cry(){
		System.out.println("강아지");
	}
}

class Cat extends Animal{
	void cry(){
		System.out.println("냥이");
	}
}


public class AbstractClass {
	
	public static void main(String[] args){
		
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}
	
}