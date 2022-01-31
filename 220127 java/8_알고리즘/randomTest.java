
public class randomTest{
	
	public static void main(String[] args){
			
		int[] t1 = new int[15];
		
		for(int i = 0; i < t1.length; i++){
			t1[i] = (int)(Math.random() * 100);
			System.out.printf("%d \t",t1[i]);
		}
		System.out.println();
		
		int max = t1[0];
		int min = t1[0];
		
		for(int i = 0; i < t1.length; i++){
			if(max < t1[i]){
				max = t1[i];
			}
			if(min > t1[i]){
				min = t1[i];
			}
		}

		System.out.printf("최댓값 %d, 최솟값 %d \n", max, min);
			
		for(int obj : t1){
			System.out.print(obj + " ");
		}
	}
	
}