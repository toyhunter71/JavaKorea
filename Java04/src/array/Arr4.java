package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		//국가와 수도(5개)
		
		String nations[] = new String[5];
		String capitals[] = new String[5];
		
		nations[0] = "대한민국";
		nations[1] = "일본";
		nations[2] = "중국";
		nations[3] = "미국";
		nations[4] = "러시아";
		
		capitals[0] = "서울";
		capitals[1] = "도쿄";
		capitals[2] = "베이징";
		capitals[3] = "워싱턴";
		capitals[4] = "모스코바";
		
		System.out.println("[국가별 수도]");
		
		for(int i = 0;i < nations.length;i++) {
			System.out.println(nations[i]+"의 수도는 "+capitals[i]+"입니다.");
		}
		
		System.out.println();
		
		//사용자 입력으로 국가를 받아서
		//해당 국가의 수도들 알려주는 프로그램을 만들어 보세요
		/*
		 * 수도를 알고자하는 국가의 이름을 입력하세요 >>>
		 * 대한민국 ==> 서울
		 * 일본 ==> 도쿄
		 */
		
		String nation = "";
		int sav_i = -1;
		//String flag = "N";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도를 알고자하는 국가의 이름을 입력하세요 >>>>");
		nation = sc.next();
		
		for(int i = 0;i < nations.length;i++) {
			
			if(nation.equals(nations[i])) {
				sav_i = i;
				//flag = "Y";
				break;
			}
		}
		
		//if(flag.equals("Y")) {
		if(sav_i != -1) {
			System.out.println(nations[sav_i]+"의 수도는 "+capitals[sav_i]+"입니다.");
		}else {
			System.out.println(nation+"의 수도는 찾을 수 없습니다!");
		}
		
		sav_i = -1;
		
		System.out.print("수도를 알고자하는 국가의 이름을 입력하세요 >>>>");
		nation = sc.next();
		
		for(int i = 0;i < nations.length;i++) {
			
			if(nation.equals(nations[i])) {
				sav_i = i;
				//flag = "Y";
				break;
			}
		}
		
		//if(flag.equals("Y")) {
		if(sav_i != -1) {
			System.out.println(nations[sav_i]+"의 수도는 "+capitals[sav_i]+"입니다.");
		}else {
			System.out.println(nation+"의 수도는 찾을 수 없습니다!");
		}
		
		
				
		
		
		
		
		
		
		
	}
}
