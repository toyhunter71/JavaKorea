package extend;

public class Ex1 {
	public static void main(String[] args) {
		
		Human h1 = new Human("홍길동",16,false);
		
		h1.말하기();
		h1.밥먹기();
		
		HumanEx h2 = new HumanEx("유관순",31);
		
		h2.말하기();
		h2.밥먹기();
		
		HumanDeco h3 = new HumanDeco("박첨지",45);
		
		h3.말하기();
		h3.밥먹기();
		h3.나이정보();
		//이때, 원본에 버그가 발생해서 수정해야 하면?
		//1번 수정작업 필요 ==> 3번 수정작업 필요
		//실수를 할 화률이 높아짐
		
		//==> 문제발생 원인? *복사/붙여넣기를 했기 때문에*
		//==> '사람이' 복사/붙여넣기를 했기 때문에
		//==> 컴퓨터가 알아서 복사/붙여넣기를 하자(상속)
	}
}

//사람(Human) 클래스
class Human{
	//name, age
	
	private String name;
	private int age;
	private boolean gender;    //성별(남:false, 여:true)
	
	Human(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"(이)가 말합니다."+gender);
	}
	
	
	public void 걷기() {
		System.out.println(name+"(이)가 걷습니다."+gender);
	}
	
	
	public void 밥먹기() {
		System.out.println(name+"(이)가 밥을 먹습니다."+gender);
	}
}

//Human클래스에서 이름 옆에 나이를 추가한 클래스
class HumanEx{
	//name, age
	
	private String name;
	private int age;
	
	HumanEx(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"("+age+")"+"(이)가 말합니다.");
	}
	
	
	public void 걷기() {
		System.out.println(name+"("+age+")"+"(이)가 걷습니다.");
	}
	
	
	public void 밥먹기() {
		System.out.println(name+"("+age+")"+"(이)가 밥을 먹습니다.");
	}
}

//Human클래스에서 이름 앞에 ==를 붙인 클래스
class HumanDeco{
	//name, age
	
	private String name;
	private int age;
	
	HumanDeco(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//말하기, 걷기, 밥먹기, 나이정보
	public void 말하기() {
		System.out.println("=="+name+"(이)가 말합니다.");
	}
	
	
	public void 걷기() {
		System.out.println("=="+name+"(이)가 걷습니다.");
	}
	
	
	public void 밥먹기() {
		System.out.println("=="+name+"(이)가 밥을 먹습니다.");
	}
	
	public void 나이정보() {
		System.out.println("=="+name+"의 나이는 "+age+"살 입니다.");
	}
}