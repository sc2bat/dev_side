
public class algorithmTest{
	
	public static void main(String[] args){
		
		int[] t1 = {4, 13, 150, 17, -2};
		
		int k = 0;
		for(int i = 0; i < t1.length; i++){
			if(k < t1[i]){
				k = t1[i];
			}
		}
		
		System.out.printf("가장 큰 값은 %d 입니다 \n", k);
		
		System.out.println("둘 중 큰 값은 " + Math.max(10, 4));
		System.out.println("둘 중 작은 값은 " + Math.min(10, 4));
		
		// System.out.println(Math.max(1, 2, 3, 4, 5, 42));
		
	}
}
				