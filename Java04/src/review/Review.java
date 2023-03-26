package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		//for(초기값;조건식;증감량){반복할 코드;}
		
		//3.시험합격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		//40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달 되었으면 총점미달
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력 하세요 >>> ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력 하세요 >>> ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력 하세요 >>> ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		
		System.out.print("학생은 ");
		
		if((kor >= 40 && eng >= 40 && math >= 40) && (sum >= 150)){
			System.out.println("합격!");
		}else if(kor < 40 || eng < 40 || math < 40 ) {
			
			if(kor < 40) {
				System.out.print("국어 ");
			}
			
			if(eng < 40) {
				System.out.print("영어 ");
			}
			
			if(math < 40) {
				System.out.print("수학 ");
			}
			
			System.out.println("과락!");
			
		}else {
			System.out.println("총점미달! (총점 : "+sum+"점)");
		}	
		
		System.out.println("");
		
		//4. 1~10까지의 합 구하기
		
		sum = 0;
		
		for(int i = 1;i <= 10;i++) {
			
			sum += i;
			
		}
		
		System.out.println("1부터 10까지의 합은 : "+sum+" 입니다.");
		
		System.out.println("");
		
		//5. 10~1까지 거꾸로 출력하기
		
		for(int i = 10;i > 0;i--) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		sc.close();
		
	}
}
