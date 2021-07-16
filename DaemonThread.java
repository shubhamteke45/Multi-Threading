package MultiThreading;

public class DaemonThread {

	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		TestDaemon td = new TestDaemon();
		td.setDaemon(true);
		td.start();
	}
}

class TestDaemon extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Daemon Thread");
	}
}
