package personaldays19;

// 멤버 메소드 오버로딩

class Tsum{
	private int a;
	private int b;
	Tsum(int c, int d){
		a = c;
		b = d;
	}
	public int add() {
		return a + b;
	}
	
	public int add(int... e) {
		int tot = 0;
		for (int i = 0; i < e.length; i++) {
			tot += e[i];
		}
		return a + b + tot;
	}
	
}

public class P_Class04 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		Tsum s = new Tsum(20, 30);
		System.out.println(s.add());
		System.out.println(s.add(40, 50, 60));

	}

}
