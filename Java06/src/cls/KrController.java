package cls;

public class KrController {
	public static void main(String[] args) {
		
		KrModel km1 = new KrModel();
		KrModel km2 = new KrModel();
		
		km1.setNum(77);
		km1.setStr("Hello");
		km2.setNum(88);
		km2.setStr("Hello2");
			
//		System.out.println(km1.getNum() + " / " + km1.getStr());
//		
//		km1.printNum(km1);
//		km1.printStr(km1);
		
		KrService ks = new KrService();
		KrView kv = new KrView();

		kv.printStr(km1);
		kv.printStr(km2);
		
		ks.decoEquals(km1);
		ks.decoPlus(km2);
		
		kv.printStr(km1);
		kv.printStr(km2);
	}
}

//KrModel 클래스(num, str)
//KrModel 클래스(출력용)

class KrModel{
	
	int num;
	String str;
	
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
	
	void setStr(String str) {
		this.str = str;
	}
	
	String getStr() {
		return str;
	}
	
	void printNum(KrModel km) {
		System.out.println(num);
	}
	
	void printStr(KrModel km) {
		System.out.println(str);
	}
}

class KrView{
	
	void printNum(KrModel km) {
		System.out.println(km.getNum());
	}
	
	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

//KrService 클래스 (자바기능)
class KrService{
	//출력하기 전에 꾸며주기
	void decoEquals(KrModel km) {
		//양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");     //문자열을 가져온 다음 ==을 붙여서 저장
	}
	
	void decoPlus(KrModel km) {
		//양 옆에 + 표시
		km.setStr("+"+km.getStr()+"+");   // km.str "+" + km.str + "+";
	}
}