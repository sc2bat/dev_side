
import java.util.ArrayList;

public class ArrayListTest{

	public static void main(String[] args){
		
		/*
		ArrayList list1 = new ArrayList();
		
		list1.add("가나다");
		list1.add(30);
		list1.add("마바사");
		list1.add(40);
		
		System.out.println(list1.get(0));
		
		String s = (String)list1.get(2);
		System.out.println(s);
		
		int i = (Integer)list1.get(1);
		System.out.println(i);
		*/
		
		/*
		ArrayList<String> ar = new ArrayList<String>();
		
		// String 형변환 없이 사용 가능
		// 중복된 값 넣기 가능
		ar.add("가");
		ar.add("나");
		ar.add("다");
		ar.add("가");
		ar.add("나");
		ar.add("다");
		ar.add("라");
		ar.add("마");
		ar.add("바");
		ar.set(3, "하하하");
		for(int i = 0; i < ar.size(); i++){
			System.out.print(ar.get(i) + "\t");
		}
		
		ar.remove(4);
		System.out.println(ar.get(4));
		*/
		
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.get(i).length; j++){
				System.out.print(list.get(i)[j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		
		list.add(new Integer[]{1, 2, 3, 4});
		list.add(new Integer[]{1, 2, 3, 4});
		list.add(new Integer[]{1, 2, 3, 4});
		list.add(new Integer[]{1, 2, 3, 4});
		
		/*
		for(int[] i : list){
			System.out.print(i);
		}
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.
		*/
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.get(i).length; j++){
				System.out.print(list.get(i)[j] + " ");
			}
			System.out.println();
		}
		
	}

}