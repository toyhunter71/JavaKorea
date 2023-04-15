package string;

public class String1 {
	public static void main(String[] args) {
		//String 문자열(자바에서 제공해주는 클래스)
		
		String str = "hello world!";
		
		//두 문자열이 같은지 비교하는 메서드 equals
		boolean result = str.equals("hello world");
		System.out.println(result);
		
		if(str.equals("hellow world")) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		//2. 해당 문자열을 포함하는지 검사 contains
		if(str.contains("hell")) {
			System.out.println("갖고 있네");
		}else {
			System.out.println("안갖고 있네");
		}
		
		//3. 교체 replace
		String result2 = str.replace("hello", "hi");
		System.out.println(result2);
		
		//4. 글자수 알려주기 length()
		System.out.println(str.length());
//		System.out.println(result2.length());
		
		//"hi" >> ['h','i',0]
		//5. 글자의 시작 위치를 알려주기  indexOf()
		int result3 = str.indexOf("world");    //world의 w위치를 알려줌(배열 형태로)
		System.out.println(result3);
		
		//6.위치를 알려주면 해당하는 글자를 알려주기 charAt()
		char result4 = str.charAt(1);     // hello world!
		System.out.println(result4);      // e
		
		//7. 잘라내기(추출하기) substring
		result2 = str.substring(1,5);  //1 ~ 4번방을 잘라냄
		System.out.println("7 : "+result2);
		
		//8. 합치기 +
		str = str + "@@";
		System.out.println(str);
		
		//quiz. src변수에서 '길동'만 추출해서 출력
		String src = "홍길동";
		
		System.out.println(src.length());
		System.out.println(src.substring(1,3)); //3으로 사용하는 이유는 null문자까지
		
		System.out.println(src.substring(src.indexOf("길"), src.indexOf("동")+1));
		
		//quzi2. scr2변수에서 홍길동을 장보고로 바꿔서 출력
		String src2 = "안녕하세요 저는 홍길동입니다. 올해 23살 입니다.";
		
		System.out.println(src2.replace("홍길동", "장보고"));
		
		
			
				
	}
}
