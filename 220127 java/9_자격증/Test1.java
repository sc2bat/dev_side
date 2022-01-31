// 중첩 반복문 구조
// continue label 
// continue continue label 사용

public class Test1{
	
	public static void main(String[] args){
			
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				int output = i * 10 + j;
				
				if(output %2 != 0){
					continue;
				}else{
					System.out.print(output + " ");
				}
			}
			System.out.println();
		}
			
	}
	
}
