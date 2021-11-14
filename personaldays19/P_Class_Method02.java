package personaldays19;

public class P_Class_Method02 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//오버로딩
		int m1 = max(5, 10);
		int m2 = max(5, 10, 15);
		int m3 = max(5, 10, 15, 20);
		
		prn(m1);
		prn(m2);
		prn(m3);

	}
	
	public static void prn(int a) {
		System.out.printf("%d \n", a);
	}
	
	public static int max(int a, int b) {
		int max = (a > b)? a : b;
		return max;
	}
	
	public static int max(int a, int b, int c) {
		int max = max(a, b);
		max = max(max, c);
		return max;
	}
	
	public static int max(int a, int b, int c, int d) {
		int max = max(a, b);
		max = max(max, c);
		max = max(max, d);
		return max;
	}

}
