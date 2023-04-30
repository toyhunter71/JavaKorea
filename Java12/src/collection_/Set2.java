package collection_;

import java.util.HashSet;
import java.util.Scanner;

public class Set2 {
	public static void main(String[] args) {
		
		NationSet ns = new NationSet();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String nation = "";
		String nation_before = "";
		String nation_after = "";
		
		while(true) {
			System.out.println("==== 국가 이름 저장 프로그램 ====");
			System.out.println("1.추가 2.조회 3.변경 4.삭제 0.끝내기");
			
			choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				System.out.println("추가할 국가명을 입력 >> ");
				nation = sc.nextLine();
				ns.addNation(nation);
			}else if(choice == 2) {
				ns.showAll();
			}else if(choice == 0) {
				System.out.println("프로그램 종료~~~");
				sc.close();
				break;
			}else if(choice == 3) {
				System.out.println("변경할 국가명을 입력 >> ");
				nation_before = sc.nextLine();
				System.out.println("변경 후 국가명을 입력 >> ");
				nation_after = sc.nextLine();
				ns.modifyNation(nation_before, nation_after);
			}else if(choice == 4) {
				System.out.println("삭제할 국가명을 입력 >> ");
				nation = sc.nextLine();
				ns.deleteNation(nation);
			}
			
		}
	}
}

//국가 이름을 보관하는 프로그램, 중복값이 없애야 한다
class NationSet{
	//멤버 변수 private
	private HashSet<String> hs = new HashSet<String>();
	
	//메서드 public
	public void addNation(String str) {
		hs.add(str);
	}
	
	public void modifyNation(String str1, String str2) {
		hs.remove(str1);
		hs.add(str2);
	}

	public void deleteNation(String str) {
		hs.remove(str);
	}
	
	public void showAll() {
//		Iterator<String> it = hs.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for (String e : hs) {
			System.out.println(e);
		}
	}
}