package cls;

public class Review {
	public static void main(String[] args) {
		//클래스와 메서드
		//객체지향기법 : 클래스기반, 클래스 정의와 객체화를 많이 해 봐야함
		//객체화
		//클래스명 변수명 = newz 클래스명();
		
		MyModel mm = new MyModel();       //다른 클래스의 변수나 메서드를  사용하려면 '객체화'를 해 줘야함
		MyModel mm2 = new MyModel();      //객체가 다르면 형태와 메서드는 같지만 변수가 다름(다른 공간)
		
		mm.setNum(111);
		mm.setStr("안녕");
		
		mm2.setNum(222);
		mm2.setStr("반갑");
		
		System.out.println(mm.getNum() + " " + mm.getStr());
		System.out.println(mm2.getNum() + " " + mm2.getStr());
		
		MyView mv = new MyView();    //출력용 클래스
		
		mv.printStr(mm);             //객체를 통해 값을 주고 받는다 == 객체지향기법
		mv.printStr(mm2);
		
		mv.printNum(mm);             //객체를 통해 값을 주고 받는다 == 객체지향기법
		mv.printNum(mm2);
		
		
	}
}

//MVC패턴 유행(Model(구조체같은)-View(html화면)-controller(java코드와 html코드 연결))
//사용할 변수를 지정해 놓고 갖다 사용할 수 있는 클래스(구조체처럼 사용)
class MyModel{
	//변수들, 변수에 값을 대입하거나 사용할 수 있는 메서드만
	//클래스 : 변수 + 함수를 묶어 놓은 것(멤버변수, 메서드)
	
	//멤버변수
	int num;
	String str;
	
	//메서드
	//1.num변수에 값을 넣기
	void setNum(int num) {     //()에 변수가 있으니깐 사용할 때 대입이 될 것이다
		//void : return을 안쓰겠다(사용하는 곳에 넘겨줄 값이 없다)
		this.num = num;
	}
	
	//2.num변수 사용하기
	//사용하려면 사용한 곳에 값을 넘겨줘야하기 때문에 자료형을 넣어준다
	int getNum() {       //정수값 num을 사용한 곳에 return(전다)해줄 것이기 때문에 자료형은 int
		return num;      //이름이 중복되는 매개변수나 지역변수가 없으면 this.은 생략가능
	}
	
	//3.str값 넣기
	void setStr(String str) {
		this.str = str;
	}
	
	//4.str값 사용하기
	String getStr() {
		return str;
	}
}

//출력용(화면,소리, .....)
class MyView{
	void printNum(MyModel mm) {
		System.out.println(mm.num);
	}
	
	void printStr(MyModel mm) {
		System.out.println(mm.str);
	}
	
	
}