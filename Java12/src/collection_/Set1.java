package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		//List, Set, Map
		//List : 동적배열(순서 있음, 중복 가능)
		//Set : List에서 중복이 불가능하게 함(순서 없음, 중복 없음)
		//Map : 방번호를 내가 정함, {키:값, 키:값} (키와 값의 쌍으로 구성)
		
		//Set : HashSet(순서 없음, 중복 없음), TreeSet(순서 있음(오름차순 정렬), 중복 없음)
		//Iterator : Set 전체 사용을 위해서 많이 쓰임(Set이 순서가 없어서 순서를 할당)
		//Set : Map을 사용할 때, 중복값을 없애는 기능이 필요할 때
		
		HashSet<Integer> hs = new HashSet<>();    //Set은 중복이 않된다
		
		//추가 add
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		//전체 조회는 Iterator
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());      //1 2 3 4
		}
		
		//TreeSet : HashSet + 정렬 기능
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("a");
		ts.add("b");
		ts.add("d");
		ts.add("a");
		ts.add("b");
		ts.add("c");
		
		//과거 
		Iterator<String> iter = ts.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());      
		}
		
		//현재
		for(String element : ts) {
			System.out.println(element);
		}
		
		
		int 배열[] = {1,2,3,4,5,6,7,8,9};
		//전체 조회(일반for문)
		for(int i=0;i<배열.length;i++) {
			System.out.print("1. "+배열[i]+" ");
		}
		
		//for-each(배열전용 for문)
		for(int 임시 : 배열) {
			System.out.print("2. "+임시+" ");
		}
	}
}
