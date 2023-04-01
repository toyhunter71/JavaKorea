package cls;

public class Method1 {
	public static void main(String[] args) {
		//메서드 사용하는 법 ()
		//함수명();
		
		int result = 3 + 4;    //3과 4를 더한 결과를 반환(7)
		System.out.println(result);
		
		MyClass4 mc4 = new MyClass4();    //다른 클래스의 값을 사용하기 위해 객체화
		int result2 = mc4.더하기(3, 4);
		
		System.out.println(result2);
	}
}

class MyClass4{
	//메서드 : 클래스 안에 있는 함수, this를 갖고 있음
	//메서드를  만든 이유 : 함수에 포인터 사용을 생략하기 위해서
	
	//메서드 만드는 방법(){}
	//자료형 함수명(){}
	
	//+ : 숫자 2개를 받아서 합친 결과를 반환
	//더하기하는 기호를 직접 만들기
	int 더하기(int num1, int num2) {           //값을 받기 위해선 ()에 변수를 생성해 놓는다
		int result = num1 + num2;
		return result;                        //결과값을 반환한다(반환 : 사용한 곳에 전달한다)
	}
	
}