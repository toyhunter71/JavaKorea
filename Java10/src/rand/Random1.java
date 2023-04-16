package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
		//자바에서 랜덤을 사용하는 법
		//Math클래스 또는 Ramdom클래스 사용
		int num1, num2;
		
		MyRandom md = new MyRandom();
//		md.go1();
//		md.go2();
//		md.go3();
		md.go4();
		
//		while(true) {
//			
//			md.go3();
//		}
		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("첫번째 숫자를 입력 하세요  >>>> ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력 하세요  >>>> ");
		num2 = sc.nextInt();
		
		MyRandomTwo mrt = MyRandomTwo.getInstance(num1, num2);
		
		sc.close();
		
		while(true) {
			
			mrt.go4(num1, num2);
		}
	}
}

class MyRandom{
	//nextInt() : 0 ~ 0.9999999 까지 랜덤
	public void go1() {
		//0 ~ 9 랜덤
		Random random = new Random();
		int result = random.nextInt(10);   //0 ~ 9까지 랜덤(0*10 ~ 0.9999*10)
		
		System.out.println(result);
	}
	
	public void go2() {
		//100 ~ 105 까지 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100;      //(0*6 ~ 0.9999999*6) + 100  == 100 ~ 105
		
		System.out.println(result);
	}
	
	public void go3() {
		//1 ~ 10 까지 랜덤
		Random random = new Random();
		int result = random.nextInt(10) + 1;      //(0*10 ~ 0.9999999*10) + 1  == 1 ~ 10
		
		System.out.println(result);
	}
	
	//Math 클래스를 사용해서 랜덤
	public void go4() {
		int result = (int)(Math.random() * 10) + 1;     //1 ~ 10
		System.out.println(result);
	}
}

//싱글턴패턴 클래스로 생성하여 사용자에게 두 수를 입력받아 그 사이에서 랜덤을 돌려 리턴해 주는 메서드
class MyRandomTwo {
	
	private MyRandomTwo() {
		
	}
	
	private static MyRandomTwo instance;
	
	public static MyRandomTwo getInstance(int num1, int num2) {
		if(instance == null) {
			instance = new MyRandomTwo();
		}
		
		return instance;
	}
	
	public void go4(int num1, int num2) {
		
		int chg_num;
		
		if (num1 > num2) {
			chg_num = num1;
			num1 = num2;
			num2 = chg_num;
		}
		
		num2 = num2 - num1 + 1; 
		
		Random random = new Random();
		int result = random.nextInt(num2) + num1; 
		
		System.out.println(result);
	}
}