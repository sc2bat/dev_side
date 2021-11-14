package personaldays19;

class qwer{
	static int[][] s;
	static double[] a;
}

public class P_Class_Method03 {

	public static void main(String[] argrs) {
		/**/
		qwer.s = new int[gs1()][gs1()+1];
		qwer.a = new double[qwer.s.length];
		
		input(qwer.s);
		cals(qwer.s, qwer.a);
		output(qwer.s, qwer.a);

	}
	
	public static int gs1() {
		int x = (int)(Math.random() *6 +1);
		System.out.printf("T2 : %d\t", x);
		return x;
	}
	
	public static void input(int[][] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				s[i][j] = (int)(Math.random() *60 +1);
			}
		}
	}
	
	public static void cals(int[][] s, double[] a) {
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length -1; j++) {
				s[i][s[i].length -1] += s[i][j];
			}
			a[i] = s[i][s[i].length -1] / (double)(s[i].length -1);
		}
	}
	
	public static void output(int[][] s, double[] a) {
		int s1 = s.length;
		int s2 = s[0].length;
		
		System.out.println();
		for (int i = 0; i < s1; i++) {
			System.out.printf("%d\t", i+1);
			for (int j = 0; j < s2; j++) {
				System.out.printf("%d\t", s[i][j]);
			}
			System.out.printf("%.1f\n", a[i]);
		}
	}

}
