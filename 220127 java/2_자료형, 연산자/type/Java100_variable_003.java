// 자바의 Primitive Data Type의 바이트 크기와 비트 크기를 출력하는 코드를 구현하시오.
// 정수형 타입과 문자형 타입에 대해서만 구현한다.
// 이때, 각 타입의 최댓값과 최솟값도 같이 구하여 출력하시오.


public class Java100_variable_003 {
	public static void main(String[] args) {
		
		// byte, short, int, long, char
		System.out.println( "byte \t: " + Byte.BYTES + "(byte)" + " --> " + Byte.SIZE + "(bit)\t" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println( "short \t: " + Short.BYTES + "(byte)" + " --> " + Short.SIZE + "(bit)\t" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println( "int \t: " + Integer.BYTES + "(byte)" + " --> " + Integer.SIZE + "(bit)\t" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println( "long \t: " + Long.BYTES + "(byte)" + " --> " + Long.SIZE + "(bit)\t" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println( "char \t: " + Character.BYTES + "(byte)" + " --> " + Character.SIZE + "(bit)\t" + Character.MIN_VALUE + "~" + Character.MAX_VALUE);
		System.out.println( "char \t: " + Character.BYTES + "(byte)" + " --> " + Character.SIZE + "(bit)\t" + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
		
	}
}




