package condition;

public class Ifelse2 {
	public static void main(String[] args) {
		
		int num = 99;
		
		//10보다 작은지, 100보다 작은지, 1000보다 작은지, 1000이상인지
		//if만 쓰기
		if(num < 10) {
			System.out.println("10보다 작다");
		}
		if(num < 100) {
			System.out.println("100보다 작다");
		}
		if(num < 1000) {
			System.out.println("1000보다 작다");
		}
		
		System.out.println("===============================");
		//if~else if~else : 셋트
		if(num < 10) {
			System.out.println("10보다 작다");
		}else if(num < 100) {
			System.out.println("100보다 작다");
		}else if(num < 1000) {
			System.out.println("1000보다 작다");
		}else {
			System.out.println("그 밖에");
		}
		
		
		//if와 관계연산자 사용
		if(num < 10) {
			System.out.println("10보다 작다");
		}
		
		if(num >= 10 && num < 1000) {
			System.out.println("10이사이고 100보다 작다");
		}
		
		if(num >= 100 && num < 1000) {
			System.out.println("100이상이고 1000보다 작다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
