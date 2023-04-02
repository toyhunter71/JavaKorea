package cls;

public class Constructor2 {
	public static void main(String[] args) {
		
		
		Person 홍길동 = new Person("홍길동",37);
		Person 유관순 = new Person("유관순",27);
		
		PersonView pv1 = new PersonView();
		PersonView pv2 = new PersonView(홍길동);

		pv1.info(홍길동);
		pv1.info(유관순);
		
		pv2.info();

		
	}
}

class Person{
	// 멤버변수 : 이름, 나이
	// 생성자 (생성자 통해서 멤버변수 초기화)
	// 게터세터
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class PersonView {
	private Person person;
	
    //기본생성자
	//PersonView a = new PersonView();
	public PersonView() {   //여러 형태의 생성자(객체화)를 허용해주려고
	}

	// 생성자 : 받아온 객체를 멤버변수에 백업
	public PersonView(Person person) {
		this.person = person;
	}

	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름: " + person.getName() + ", 나이 : " + person.getAge());
	}

	// 오버로딩(바뀐 사람으로 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름: " + person.getName() + ", 나이 : " + person.getAge());
	}
}