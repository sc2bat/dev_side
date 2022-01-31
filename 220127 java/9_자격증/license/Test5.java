import java.util.Scanner;
import java.util.Arrays;

class Qwer{
	Qwer(){}
	
	public static int[] ranInt(int x, int y){
		int[] list = new int[x];
		for(int i = 0; i < list.length; i++){
			// list[i] = i;
			// System.out.print(list[i] + " ");
			list[i] = (int)(Math.random() *y) +1;
		}
		
		return list;
	}
	
	public void result(int y, int[] list){
		int[] ar = new int[y+1];
		
		for(int i = 0; i < list.length; i++){
			ar[list[i]]++;
		}
		
		for(int i = 1; i < ar.length; i++){
			System.out.println(i + "번 " + ar[i] + " 표");
		}
		
		int c1 = 0;
		int d1 = 0;
		for(int i = 1; i < ar.length; i++){
			if(c1 < ar[i]){
				c1 = ar[i];
				d1 = i;
			}
		}
		
		System.out.println("다득표 후보 " + d1 + " 획득 표 " + c1);
		
		if(c1 > list.length/ (double)2){
			System.out.println("당선");
		}else{
			System.out.println("미당선");
		}
	}
}

public class Test5{
	
	public static void main(String[] args){
		Qwer t1 = new Qwer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("투표 인원 입력 : ");
		int a = sc.nextInt();
		System.out.println("후보 인원 입력 : ");
		int b = sc.nextInt();
		
		// 투표 시작
		int[] list = t1.ranInt(a, b);
		
		/* list value test
		for(int i : list){
			System.out.print(i + " ");
		}
		*/
		
		// int[] ar = new int[a+1];
		
		// 투표 결과
		t1.result(b, list);
		
		
		
	}
}