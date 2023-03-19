package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40;
		int 수학 = 60;
		
		System.out.println("합계 : "+(국어+영어+수학)+"점");
		System.out.println("평균 : "+((국어+영어+수학)/3)+"점");
		System.out.println("평균 : "+((국어+영어+수학)/3.0)+"점");
		System.out.println("평균 : "+((double)(국어+영어+수학)/3.0)+"점");
	}
}
