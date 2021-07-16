package MultiThreading;

public class ThreadSleep {

	public static void main(String[] args) {
		
		SleepMethod sm1 = new SleepMethod();
		sm1.start();
		
		SleepMethod sm2 = new SleepMethod();
		sm2.start();
	}
}

class SleepMethod extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
