package personaldays19;

public class P_Class_Method01 {

	public static void main(String[] argrs) {
		/**/
		//Scanner sc = new Scanner(System.in);
		//
		int[] a = new int[9];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() *9) +1;
		}
		
		int tot = sum(a);
		double ave = average(a);
		prn(a, tot, ave);

	}
	
	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double average(int[] a) {
		int t = sum(a);
		double ave = t / a.length;
		return ave;
	}
	
	public static void prn(int[] a, int b, double c) {
		System.out.printf("배열의 값들 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d [%d] ", i, a[i]);
		}
		System.out.println();
		System.out.printf("총값 : %d, 평균 : %.2f", b, c);
		
		
	}

}
