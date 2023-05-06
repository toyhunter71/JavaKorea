package _thread;

public class MyThread3 {
	public static void main(String[] args) {
		
		PrtThead1 pt1 = new PrtThead1();
		PrtThead2 pt2 = new PrtThead2();
		
		pt1.start();
		pt2.start();
	}
}

//클래스 2개를 생성해서 쓰레드를 각가 상속 받고
//반복문을 100번 돌려서 동시에 출력
//1. 쓰레드1
//2. 쓰레드2

class PrtThead1 extends Thread{
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드1 "+ i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PrtThead2 extends Thread{
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드2 "+ i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}