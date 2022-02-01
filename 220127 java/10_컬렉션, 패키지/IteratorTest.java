
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorTest{
	
	public static void main(String[] args){
		
		/*
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Alligator");
		list.add("Hippo");
		list.add("Ostrich");
		list.add("Donkey");
		
		for(String s : list){
			System.out.print(s + " ");
		}
		
		list.remove("Hippo");
		
		System.out.println("하마 삭제");
		for(String s : list){
			System.out.print(s + " ");
		}
		*/
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("bcd");
		list.add("cde");
		list.add("def");
		list.add("efg");
		
		/*
		for(String s : list){
			System.out.println(s);
		}
		*/
		
		Iterator<String> iter = list.iterator();
		
		/*
		System.out.println(iter.hasNext());	// true
		System.out.println(iter.next());		
		System.out.println(iter.hasNext());		
		System.out.println(iter.next());		
		System.out.println(iter.hasNext());		
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext()); // false
		*/
		
		while(iter.hasNext()){
			String s = iter.next();
			if(s.equals("def")){
				iter.remove();
				System.out.println("delete");
			}
		}
		
		for(String s : list){
			System.out.print(s + " ");
		}
		
	}
	
}
