package MultiThreading;

public class ThreadYeild {

	public static void main(String[] args) {
		
		YeildMethod ym = new YeildMethod();
		ym.start();
		Thread.yield();
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}

class YeildMethod extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
