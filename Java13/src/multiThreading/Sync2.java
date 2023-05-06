package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		//사람 3명(Thread 3개)
		DressRoom dr = new DressRoom();
		Thread 홍길동 = new Thread(dr, "홍길동");
		Thread 유관순 = new Thread(dr, "유관순");
		Thread 이성계 = new Thread(dr, "이성계");
		
		홍길동.start();
		유관순.start();
		try {
			유관순.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		이성계.start();
	}
}

//의상탈의실
//의류가게에서는 한 사람이 옷을 갈아입으러 탈의실에 들어가면 나올때까지 밖에서 대기를 해줘야한다
class DressRoom implements Runnable{

	@Override
	public void run() {
		synchronized (this) {      //이미 사용중이면 다른 애들은 대기
			
			String name = Thread.currentThread().getName();
			
			System.out.println(name+"이 탈의실에 들어갔습니다!");
			
			for(int i= 1;i<=10;i++) {
				System.out.println(name+"이 탈의실 사용 중...."+i+"초");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(name+"이 탈의실 사용을 마쳤습니다~~");
		}
	}
	
}