package string;

public class String2 {
	public static void main(String[] args) {
		MyClass9 mc = new MyClass9();
		
		//카페 포스기와 키오스크와 모바일간 통신(보안)
		               //012345678901234567890123456   
		String order1 = "name=001price=002000type=0";         //에소프레소, 2000원, 뜨거운
		System.out.println(mc.info(order1));
		
		String order2 = "name=003price=006000type=1";         //까페라떼, 6000원, 차가운
		System.out.println(mc.info(order2));
		
		String order3 = "name=004price=006000type=1";         //딸기라떼, 6000원, 차가운
		System.out.println(mc.info(order3));
		
	}
}

class MyClass9{
	public String info(String str) {
	    //name 001:에스프레소, 002:아메리카노, 003:까페라떼, 004:딸기라떼, 005:케모마일차
		//price
		//type 0:뜨거운, 1:차가운
		
		String result = "";
		String name = "", type = "";
		int price = 0;
		
		String name_cod = str.substring(5,8);
//		System.out.println(name_cod);
		String price_cod = str.substring(14,20);
		String type_cod = str.substring(25,26);
		
		if(name_cod.equals("001")){
			name = "에스프레소";
		}else if(name_cod.equals("002")) {
			name = "아메리카노";
		}else if(name_cod.equals("003")) {
			name = "까페라떼";
		}else if(name_cod.equals("004")) {
			name = "딸기라떼";
		}else if(name_cod.equals("005")) {
			name = "케모마일차";
		}
		
		price = Integer.parseInt(price_cod);
		
		if(type_cod.equals("0")) {
			type = "뜨거운";
		}else {
			type = "차가운";
		}
		
		result = type + " " + name + " " + price + "원";
		
		return result;
	}
}