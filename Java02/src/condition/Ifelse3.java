package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		//1.20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 >>>> ");
		
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 14) {
			System.out.println("청소년");
		}else {
			System.out.println("어린이");
		}
		
		System.out.println("===============================================================");
		//2.학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그미만은 F)
		
		int score;
		
		System.out.print("학점를 입력해 주세요 >>>> ");
		
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
        
		System.out.println("===============================================================");
		//3.비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다'
		//틀리면 '비밀번호가 다릅니다.'(비밀번호는 정수)
		
        int password = 1213;
        int pw;
		
		System.out.print("비밀번호를 입력해 주세요 >>>> ");
		
		pw = sc.nextInt();
		
		if(password == pw) {
			System.out.println("비밀번호가 맞습니다.");
		}else {
			System.out.println("비밀번호가 다릅니다.");
		}
		
		System.out.println("===============================================================");
		//4.윤년 판별하기(년도를 입력받아 해당 년도가 윤년인지 판별해 보세요)
		
		int year;
		
		System.out.print("연도를 입력해 주세요 >>> ");
		
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			System.out.println("윤년 입니다.");
		}else if(year % 4 == 0) {
			if(year % 100 == 0) {
				System.out.println("윤년이 아닙니다.");
			}else {
				System.out.println("윤년 입니다.");
			}
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
//		if(year % 4 == 0 && year % 100 != 0) ||
		
		
		
		
		
		sc.close();
		
		
	}
}
