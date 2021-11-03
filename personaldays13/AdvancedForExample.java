package personaldays13;

public class AdvancedForExample {

	public static void main(String[] argrs) {
		/**/
		//
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 : " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균 : " +  avg);

	}

}
