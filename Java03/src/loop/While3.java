package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		//while문의 플래그를 활용하여
		//1~10의 합계를 구해보세요(정답은 55)
		
		int sum = 0;
		int i = 0;
		
		while(i < 10) {
			i++;
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은 : "+sum+" 입니다.");
		
		int num = 0;
		
		sum = 0;
		i = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >>> ");
		
		num = sc.nextInt();
		
		while(i < num) {
			i++;
			sum += i;
		}
		
		System.out.println("1부터 "+num+"까지의 합은 : "+sum+" 입니다.");	
				
	}
}
