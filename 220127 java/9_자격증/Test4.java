class Solution{
	Solution(){}
	public void solutionMethod(int x, int[] vote_box){
		
		int[] ar = new int[x+1];
		
		for(int i = 0; i < vote_box.length; i++){
			ar[vote_box[i]]++;
		}
		
		for(int j = 1; j < ar.length; j++){
			System.out.println(j + "번 후보" + ar[j] + " 표");
		}
		
		int n1 = 0;
		int max_v = 0;
		for(int k = 1; k < ar.length; k++){
			if(ar[k] > max_v){
				max_v = ar[k];
				n1 = k;
			}
		}
		
		System.out.printf("%d 번후보 \t %d 표 획득 \n", n1, max_v);
		
		// boolean result = max_v > (vo
		if(max_v > n1 / (double)2){
			System.out.println("과반수 당선");
		}else{
			System.out.println("미당선");
		}
	}
}


public class Test4{
	
	public static void main(String[] args){
			
		Solution s1 = new Solution();
		
		int[] vote_box = {1, 3, 1, 1, 3, 2, 2};
		int[] test = new int[10];
		for(int i = 0; i < test.length; i++){
			test[i] = (int)(Math.random() * 3) + 1;
		}
		
		s1.solutionMethod(3, vote_box);
		
		System.out.println();
		s1.solutionMethod(3, test);
	}
}