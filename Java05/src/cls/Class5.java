package cls;

public class Class5 {
	public static void main(String[] args) {
		
		MyClass9 m1 = new MyClass9();
		
		m1.setVar(3, 4, "안녕", 3.14);

		MyClass9 m2 = new MyClass9();
		
		m2.num1 = 12;
		m2.num2 = 23;
		m2.str = "반갑";
		m2.dnum = 3.14;
		
		m1.정보보기();
		m2.정보보기();
		
		//모든 메서드에서 this 변수가 숨겨져 있고
		//this.을 통해서 클래스의 멤버변수와 메서드를 사용할 수 있다
		
	}
}

class MyClass9{
	int num1;             //멤버변수
	int num2;
	String str;
	double dnum;
	
	void 정보보기() {
		System.out.println(""+num1+num2+str+dnum);
	}
	
	void setVar(int num1, int num2, String str, double dnum) {
		int var = 0;    //지역변수나 매개변수는 함수가 실행된 후 삭제됨
		//그래서 멤버변수에 백업
		
		this.num1 = num1;
		this.num2 = num2;
		this.str = str;
		this.dnum = dnum;
		
				
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getDnum() {
		return dnum;
	}
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}
	
}
