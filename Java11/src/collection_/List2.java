package collection_;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		
		ArrayList2 arr = new ArrayList2();
		Scanner sc = new Scanner(System.in);
		
		arr.setMenuPrice();
		
		System.out.println("==항목을 선택하세요==");
		System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.나가기");
		
		String str = "";
		int num;
		int choice = sc.nextInt();
		
		switch(choice) {
		case 0:
			System.out.println("종료");
			break;
		case 1:
			System.out.println("추가할 메뉴를 입력하세요>> ");
			str = sc.next();
		    arr.addMenuPrice(str);     //구현 (값은 1000원으로 통일)
		    arr.printMene();
		    break;
		case 2:
		    arr.printMene();
			System.out.println("변경할 메뉴를 입력하세요>> ");
			num = sc.nextInt();
			str = sc.next();
			arr.modifyMenuPrice(num, str);
//		case 3:
//			System.out.println("삭제할 메뉴를 입력하세요>> ");
//			str = sc.next();
//			arr.deleteMenuPrice(str);
		case 4:
			arr.printMene();
		}
				
	}
}

class ArrayList2{
	
	//ArrayList 2개를 통해서 진행해 보세요(add, get, size)
	ArrayList<String> menu = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public void setMenuPrice() {
		//라면, 김밥, 떡볶기, 순대
		//1000, 2000, 3000, 4000
		
		menu.add("라면");
		menu.add("김밥");
		menu.add("떡볶기");
		menu.add("순대");
		
		price.add(1000);
		price.add(2000);
		price.add(3000);
		price.add(4000);
		
	}
	
	public void addMenuPrice(String str) {
		menu.add(str);
		price.add(1000);
	}
	
	public void modifyMenuPrice(int num, String str) {
		menu.set(num, str);
	}
	
	public void deleteMenuPrice(int num) {
		menu.remove(num);
	}
	
	public void printMene() {
		
		for(int i=0;i<menu.size();++i) {
			System.out.println(menu.get(i)+ " : "+price.get(i)+"원");
		}
	}
	
	
	
	
	
	
	
	
	
	
}