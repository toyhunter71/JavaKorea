package cls;

public class Method4 {
	public static void main(String[] args) {
		//객체화
		
		MyClass7 mc7 = new MyClass7();
		
		System.out.println(mc7.더하기(1, 1));
		System.out.println(mc7.빼기(3, 2));
		System.out.println(mc7.곱하기(7, 7));
		System.out.println(mc7.나누기(9, 0));
		System.out.println(mc7.나누기(7, 3));
		System.out.println(mc7.나머지구하기(13, 7));
		System.out.println(mc7.나머지구하기(4, 7));
		System.out.println(mc7.나머지구하기(13, 0));
	}
}

class MyClass7{
	//더하기
	int 더하기(int num1, int num2) {
		System.out.println(num1+"과 "+num2+"을 더하기 합니다.");
		return num1+num2;
	}
	
	int 빼기(int num1, int num2) {
		System.out.println(num1+"에서 "+num2+"를(을) 빼기 합니다.");
		return num1-num2;
	}
	
	int 곱하기(int num1, int num2) {
		System.out.println("곱하기를 합니다.");
		return num1*num2;
	}
	
	double 나누기(int num1, int num2) {
		System.out.println("나누기를 합니다.");
		
		if(num1 == 0 || num2 == 0) {
			return 0.0;
		}
		
		return num1/num2;
	}
	
	int 나머지구하기(int num1, int num2) {
		int result = 0;
		
		System.out.println(num1+"을 "+num2+"로 나눈 나머지를 구합니다.");
		
		if(num2 == 0) {
			result = num1;
		}else {
			result = num1 - ((num1/num2)*num2);
		}
		
		// 방법2
//		result = num1;
//		while(true) {
//			if(result < num2) {
//				break;
//			}
//			result -= num2;
//		}
		
		return result;
	}
	
}