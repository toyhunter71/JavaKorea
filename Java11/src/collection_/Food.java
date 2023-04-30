package collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		//1.추가 2.변경 3.삭제 4.전체보기 0.끝내기
		//기본 메뉴 : 김밥, 떡볶기, 순대
		//가격 : 1000, 2000, 3000
		//음식점 항목을 관리하는 프로그램 만들기
		
		FoodList fl = new FoodList();
		
		String str = "";
		String after = "";
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 항목을 선택해 주세요 ====");
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.끝내기");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("추가할 메뉴를 적어주세요 >> ");
				str = sc.next();
				System.out.println("추가할 메뉴의 가격을 적어주세요 >> ");
				num = sc.nextInt();
				fl.addFoodList(str, num);
			}else if(choice == 2) {
				System.out.println("변경할 메뉴를 적어주세요 >> ");
				str = sc.next();
				System.out.println("변경 후 메뉴를 적어주세요 >> ");
				after = sc.next();
				System.out.println("변경 후 메뉴의 가격을 적어주세요 >> ");
				num = sc.nextInt();
				fl.modifyFoodList(str, after, num);
			}else if(choice == 3) {
				System.out.println("삭제할 메뉴를 적어주세요 >> ");
				str = sc.next();
				fl.deleteFoodList(str);
			}else if(choice == 0) {
				System.out.println("프로그램을 종료합니다!!!");
				sc.close();
				break;
			}else {
				System.out.println("==== 현재의 메뉴는 다음과 같습니다 ====");
				fl.displayFoodList();
			}
			    
		}
				
				
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		
		String arr1[] = {"김밥","떡복기","순대"};
//		int arr2[] = {1000, 2000, 3000};
		
		name.addAll(Arrays.asList(arr1));
//		name.add("김밥");
//		name.add("떡볶기");
//		name.add("순대");
		
		price.add(1000);
		price.add(2000);
		price.add(3000);
		
	}
	
	public void addFoodList(String str, int num) {
		name.add(str);
		price.add(num);
	}
	
	public void modifyFoodList(String before, String after, int num) {
		int number = name.indexOf(before);
		
		name.set(number, after);
		price.set(number, num);
	}
	
	public void deleteFoodList(String str) {
		int number = name.indexOf(str);
		
		name.remove(number);
		price.remove(number);
	}
	
	public void displayFoodList() {
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i)+" : "+price.get(i)+"원");
		}
	}
	
}