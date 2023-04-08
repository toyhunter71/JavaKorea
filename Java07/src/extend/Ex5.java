package extend;

public class Ex5 {
	public static void main(String[] args) {
//		MyStr ms = new MyStr("hello");
//		ms.printStr();
		
		MyStrDeco msd = new MyStrDeco("hello");
		msd.printStr();
	}
}

class MyStr{
	protected String str;
    
	//생성자
	public MyStr(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void printStr() {
		System.out.println(str);
	}
}

class MyStrDeco extends MyStr{

	public MyStrDeco(String str) {
		super(str);                    //부모 생성자에 매개변수가 있으면(기본 생성자가 없으면) 자식 생성자에서 사용을 해줘야 함
	}
	
	public void printStr() {
		System.out.println("==========================");
		System.out.println("========== "+str+" =========");
		System.out.println("==========================");
		
	}
}