package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		//사용자에게 점수를 입력 받고
		//점수가 90점 이상이면
		//우등생입니다.
		//를 출력하는 프로그램을 만들어 주세요
		
		int num = 0;
		
		System.out.print("점수를 입력해 주세요  >>>   ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		if(num >= 90) {
			System.out.println("우등생 입니다!");
		}
		
	}
}
