package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//1. 1~10 중 짝수만 출력하기
		for(int i = 1;i<=10;i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println("짝수 : "+i);
		}
		
		//2. 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다!, 기회를 모두 사용하면 접속불가.)
		int passwd = 4321;
		int pw = 0;
		
		for(int i = 1;i<=5;i++) {
			
			System.out.print("비밀번호를 입력하세요 >>>> ");
			pw = sc.nextInt();
			
			if(passwd == pw) {
				System.out.println("맞췄다!");
				break;
			}
			
			if(i == 5) {
				System.out.println("기회를 모두 사용했습니다. 접속불가.");
			}
		}
		
		

	}
}
