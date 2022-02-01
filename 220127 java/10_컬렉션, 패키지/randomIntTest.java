
public class randomIntTest{
	
	public static void main(String[] args){
		
		int[] list = new int[10];
		
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random() * 10) + 1;
			System.out.print(list[i] + " ");
		}
	}
}