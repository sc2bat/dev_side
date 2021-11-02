package personaldays12;

public class ArrayCopyByForExample {

	public static void main(String[] argrs) {
		/**/
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		// 1, 2, 3, 0, 0, 
		
		// 배열 복사
		// System.arraycopy();
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
//		Object src 원본배열
//		int srcPos 원본 배열에서 복사할 항목의 시작 인덱스
//		Object dest 새 배열
//		int destPos 새 배열에 붙여넣을 시작 인덱스
//		int length 복사할 개수
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print( newStrArray[i] + ", ");
		}
		// java, array, copy, null, null, 
		
		

	}

}
