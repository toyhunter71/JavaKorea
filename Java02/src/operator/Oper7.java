package operator;

public class Oper7 {
	public static void main(String[] args) {
		//삼항연산자(외부 조건에 따라서 실행할 코드를 구분)
		//조건식 ? 맞으면 : 틀리면;
		
		int num = 3>2 ? 3:2;
		System.out.println(num);
		
		num = 3<2 ? 3:2;
		System.out.println(num);
	}
}
