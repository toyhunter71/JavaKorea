package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		//for문을 통해서 구현해 보세요
		
		//1. 안녕 5번
		for(int i = 0;i < 5;i++) {
			System.out.println("안녕 "+(i+1)+"번");
		}
		
		System.out.println("");
		//2. 1~10까지 합계 구하기
		
		int sum = 0;
		
		for(int j = 1; j <= 10 ; j++) {
			sum += j;
		}
		
		System.out.println("1부터 10까지의 합은 : "+sum+" 입니다.");
		System.out.println("");
		
		//3. 1~입력값까지 합계 구하기(예시 50 ==> 1 ~ 50 합계 1275)
		
		int num = 0;
		
		sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>> ");
		
		num = sc.nextInt();
		
		for(int k = 1;k <= num;k++) {
			sum += k;
		}
		
		System.out.println("1부터 "+num+"까지의 합은 : "+sum+" 입니다.");
		
		
		
	}
}
