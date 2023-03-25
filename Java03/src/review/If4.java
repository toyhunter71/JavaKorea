package review;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		//복습퀴즈 
		//사용자에게 정수를 입력받고
		//천의 자리로 ,를 넣어주세요
		
		//100 ==> 100
		//1000 ==> 1,000
		//1000000 ==> 1,000,000
		//10000 ==> 10,000
		
		String str = "";
		int num = 0;
//		double dnum = 0.0;
		str = Integer.toString(num);
		num = Integer.parseInt(str);
		
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >>> ");
		money = sc.nextInt();
		
		if(money < 1000) {
			System.out.println(money);
		}else if(money < 1000000){
			System.out.println((money / 1000)+","+"000");
		}else if(money < 1000000000){
			System.out.println((money / 1000000)+","+"000,000");
		}else {
			System.out.println((money / 1000000000)+","+"000,000,000");
		}
		
		sc.close();
		
		
	}

}
