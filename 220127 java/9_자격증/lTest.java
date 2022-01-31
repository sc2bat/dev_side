
public class lTest{
	
	public static void main(String[] args){
		
		/*
		int[] target = {1, 3, 2, 0, 3, 2, 1, 1, 2};
		
		int[] ar = new int[4];
		
		for(int i = 0; i < target.length; i++){
			ar[target[i]]++;
		}
		
		for(int i = 0; i < ar.length; i++){
			System.out.println(i + " 번째 수 " + ar[i] + " 회");
		}
		*/
		
		int[] list = new int[30];
		for(int i = 1; i < list.length; i++){
			list[i] = i;
		}
		
		/*
		for(int i : list){
			System.out.print(i);
		}
		*/
		
		for(int i = 0; i < list.length; i++){
			if(list[i] % 2 == 0){
				System.out.print(list[i] + " ");
			}
		}
		
		System.out.println("-----------------------------");
		
		int i = 0;
		while(i < list.length){
			if(list[i] %2 != 0){
				System.out.print(list[i] + " ");
			}
			i++;
		}
	}

}