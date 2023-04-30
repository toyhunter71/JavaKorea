package collection_;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.추가 2.변경 3.삭제 4.조회 0.끝내기
		MyDictionary dic = new MyDictionary();		// 생성자에서 flower:꽃, sea:바다, new:새로운
		String word1 = "", word2 = "";
		int choice = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.조회 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				// 1. 추가
				System.out.print("추가할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("추가할 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.addDictionary(word1, word2);
			}else if(choice == 2) {
				// 2. 변경
				System.out.print("변경할 영단어를 입력하세요>>");
				word1 = sc.nextLine();
				System.out.print("변경 후의 한국어 뜻을 입력하세요>>");
				word2 = sc.nextLine();
				dic.modifyDictionary(word1,word2);
			}else if(choice == 3) {
				// 3. 삭제
				System.out.println("삭제할 영단어 또는 한국어 뜻을 입력하세요>>");
				word1 = sc.nextLine();
				dic.deleteDictionary(word1);
			}else if(choice == 4) {
				// 4. 조회
				dic.displayDictionary();
			}else if(choice == 0) {
				// 0. 끝내기
				break;
			}else {
				/* no actions */
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}

// 한영사전 만들기
// 생성자에 단어 3개정도
class MyDictionary{
	// 멤버변수 private
	private HashMap<String, String> hm;
	
	public MyDictionary(){
		hm = new HashMap<String, String>();
		hm.put("flower", "꽃");
		hm.put("sea", "바다");
		hm.put("new", "새로운");
	}
	
	// 메서드 public
	public void addDictionary(String str1, String str2) {
		hm.put(str1, str2);
	}
	
	public void modifyDictionary(String str1, String str2) {
		hm.put(str1, str2);
	}
	
	public void deleteDictionary(String str) {
		String del_key = "";
		
		if(hm.containsKey(str)) {
			hm.remove(str);
		}else if(hm.containsValue(str)) {
			Set<String> set = hm.keySet();
			
			for(String e : set) {
				if(hm.get(e).equals(str)) {
					del_key = e;
				}
			}
			
			hm.remove(del_key);
			
		}else {
			System.out.println("삭제할 대상이 없습니다!!!!");
		}

	}
	
	public void displayDictionary() {
		Set<String> set = hm.keySet();
		
		for(String e : set) {
			System.out.println(e+" : "+hm.get(e));
		}
	}
}