
class P{
	// Field
	int i;
	int j;
	
	// Constructor 
	P(){
		this.i = 1;
		this.j = 2;
	}
	
	// Method
	void sum(){
		System.out.println("asdf");
	}
	
}

class H extends P{
	// Field
	String s;
	int k;
	
	// Constructor
	H(){}
	H(String s, int k){
		super();
		this.s = s;
		this.k = k;
	}
	
	// Method
	void mul(){
		System.out.println("qewr");
	}
}

class V{
	
}


public class InheritanceT{
	
	public static void main(String[] args){
		
		// 객체 생성
		P p1 = new P();
		p1.sum();
		
		H h1 = new H("가나다", 23);
		System.out.println(h1.s);
		System.out.println(h1.k);
		System.out.println(h1.i);
		System.out.println(h1.j);
	}
	
}


















