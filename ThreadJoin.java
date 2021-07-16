package MultiThreading;

public class ThreadJoin {

	public static void main(String[] args) {
		
		JoinMethod jm = new JoinMethod();
		jm.start();
		try {
			jm.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}

class JoinMethod extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}	
	}
}
