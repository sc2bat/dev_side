// 컬렉션 프레임워크의 ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보시오.
// 이 문제는 제법 까다로운 문제로서, ArrayList를 이용한 2차원 배열에 대한 개념을 잘 알고 있는지를 묻는 문제이다.
// 배열과 2차원에 대한 개념이 약하면 거의 풀지 못하므로, 사전에 일반 배열과 2차원 배열에 대한 선학습을 많이 해주고 강의를 보도록 한다.


import java.util.ArrayList;

public class Java100_collection_FrameworkArrayListTwoArr {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		ArrayList<Integer[]> arr =  new ArrayList<Integer[]>();
		
		// [2] : 요소 추가 --> add()
		arr.add( new Integer[]{ 11, 12, 13, 14 } );
		arr.add( new Integer[]{ 21, 22, 23, 24 } );
		arr.add( new Integer[]{ 31, 32, 33, 34 } );
		
	}
}























