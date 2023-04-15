package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		//#1
		//try ~ catch를 사용해서 나누기를 해보세요
		//숫자 2개를 나누기 하되
		//0이 들어올 수 있으니깐 try로 예외 처리
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1를 입력하세요 >>>> ");
		num1 = sc.nextInt();
		
		System.out.print("숫자2를 입력하세요 >>>> ");
		num2 = sc.nextInt();
		
		try {
			System.out.println(num1/num2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자2가 0입니다...확인해 주세요");
		}
		
		//#2
		//int a = sc.nextInt(): 에 대한 예외처리(숫자를 입력해야하는 함수에 문자열을 입력할 수 있음)
		
		int a;
		
		System.out.print("숫자를 입력해 주세요 반드시  >>>> ");
		try {
			a = sc.nextInt();
			System.out.println("입력한 숫자는 "+a+" 입니다.");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력한 값은 숫자가 아닙니다.");
		}
			
		//형변환 String -> int
		int c = 0;
		String str = "글자";
		
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자만 가능"+e);
		}
		
	}
}

















