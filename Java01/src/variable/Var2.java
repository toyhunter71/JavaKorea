package variable;

public class Var2 {
	public static void main(String[] args) {
		//변수 : 데이터 값을 저장해 놓은 공가(저장공간)
		//변수(수학) : 변할 수 있는 수 x,y,z
		
		//Java가 변할 수 있기 때문에 변수에 저장해 놓겠습니다.
		String var1 = "Java";
		
		System.out.println("Hello "+var1+"!");
		
		System.out.println(var1+" is Simple");
		System.out.println("안녕하세요");
		System.out.println();
		System.out.println(var1+"를 공부합니다.");	
		System.out.println(var1);
		
		System.out.println(34-2);
		//개발자가 32를 의도한건지, 34-2 글자 그 자체를 의도한건지 컴퓨터는 알 수가 없음
		//사용자의 의도를 명확하게 나타내기 위해 변수에 '자료형'이라는 개념을 추가 합니다.
		
	}
}
