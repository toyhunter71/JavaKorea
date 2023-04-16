package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
	String str1 = "멤버변수";                    //객체화 없이는 사용 불가능
	static String str2 = "static정적 멤버변수";   //객체화 안하고 사용 가능(변수 생성시점 이후에만)
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		
		System.out.println(mt.dateTime());
		System.out.println(mt.date());
		System.out.println(mt.time());
		System.out.println(mt.tomorrow());
		System.out.println(mt.after30());
		
		//System.out.println(str1);                  //바로 사용 불가능 (객체화를 해야함)
		System.err.println(MyDateTime.str2);        //static 이어서 어느 클래스 안에 있는지만 알려주면 바로 접근 가능
		
		//static으로 올려놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance();  //GetInstance. : static으로 올려놔서 막 접근이 가능
		GetInstance get2 = GetInstance.getInstance();  //get = get2
		
		//getInstance()  : static으로 객체화
		
		get.print();
		get2.print();
		
//		Singleton 홍길동 = new Singleton();
//		Singleton 이순신 = new Singleton();
		
		Singleton 홍길동 = Singleton.getInstance();
		Singleton 이순신 = Singleton.getInstance();
		
		홍길동.setStr("홍길동입니다");
		System.out.println(이순신.getStr());
		
		//getInstance() : 개체화하는 작업
		
	}
}

//클래스
//현재 시간 가져오기
class MyTime{
	//자바 코드로 현재 시간을 가져오는 법
	//Calendar, Date, SimpleDateFormat, String
	
	//멤버 변수
	private String str;
	
	//메서드
	public String dateTime() {
		//현재 시간을 반환
		
		Calendar cal = Calendar.getInstance();   //객체화(싱글턴패턴, 1회용 객체화) 시간을 가져옴
	    Date date = cal.getTime();               //DATE 형변화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");   //시간을 출력할 사항
		
		str = sdf.format(date);
		
		return str;
	}
	
	public String date() {
		//년.월.일 반환
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		
		str = sdf.format(date);
		
		return str;
	}
	
	public String time() {
		//10:00:55 반환
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		str = sdf.format(date);
		
		return str;
	}
	
	public String tomorrow() {
		//내일, 한시간 뒤
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		cal.add(Calendar.HOUR, 1);
		
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		str = sdf.format(date);

		return str;
	}
	
	public String after30(){
		//30분 뒤 시간
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE,30);            //----------> 여기
		
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		str = sdf.format(date);
	 
		return str;
	}
	
}