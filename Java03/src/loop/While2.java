package loop;

public class While2 {
	public static void main(String[] args) {
		//반복문 : 유사한 코드를 자동 수행하기 위해
		
		//안녕 5번
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
//    	System.out.println("안녕");
//		System.out.println("안녕");
		
		//안녕 10000번
		
		//while은 설계가 필요하다
		//10000번만 수행할 수 있도록
		int i = 0;
		//샘플로 3번만 수행
		while(i < 10) {
			System.out.println("안녕");
			i++;     //누적연산 += 1
		}

		//while을 사용하려면
		//플래그 변수가 필요, 조건시 세우기, while안에서 플래그의 값을 증감
		
		//퀴즈
		//while문을 사용해서 반갑습니다 15번을 해 주세요
		
		i = 0;
		
		while(i < 15) {
			System.out.println("반갑습니다. "+(i+1)+"번");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
