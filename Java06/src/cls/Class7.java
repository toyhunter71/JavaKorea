package cls;

public class Class7 {
	public static void main(String[] args) {
		//객체화
		Human h = new Human();
		
		h.setName("홍길동");
		h.setGender("남성");
		h.setAge(27);
		
//		System.out.println("이름 : "+ h.getName());
//		System.out.println("성별 : "+ h.getGender());
//		System.out.println("나이 : "+ h.getAge()+"세");
		
		HumanView hv = new HumanView();
		
		hv.printInfo(h);
		
	}
}

//멤버변수 private
//메서드 public
class Human{
	//데이터 : name, gender, age
	
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
}

class HumanView{
	public void printInfo(Human human) {
		//이름, 성별, 나이를 한번에 안내(출력)
		System.out.println("이름 : "+ human.getName());
		System.out.println("성별 : "+ human.getGender());
		System.out.println("나이 : "+ human.getAge()+"세");		
	}
}