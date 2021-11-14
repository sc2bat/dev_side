package personaldays19;

class Test{
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
}

public class P_Class02 {

	public static void main(String[] argrs) {
		/**/
		//
		Test t1 = new Test();
		Test t2 = new Test();
		t1.num = 1;
		t1.name = "테스트1";
		t1.kor = 15; 
		t1.eng = 25; 
		t1.mat = 35;
		
		t2.num = 2;
		t2.name = "테스트2";
		t2.kor = 10; 
		t2.eng = 20; 
		t2.mat = 30; 
		int t2t = tot(t2.kor, t2.eng, t2.mat);
		
		System.out.printf("번호\t\t이름\t국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n",
				t1.num, t1.name, t1.kor, t1.eng, t1.mat, 
				t1.kor+t1.eng+t1.mat, (t1.kor+t1.eng+t1.mat)/3.0);
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n",
				t2.num, t2.name, t2.kor, t2.eng, t2.mat,t2t, t2t/3.0);
		

	}
	public static int tot(int a, int b, int c) {
		int tot = a + b + c;
		return tot;
	}

}
