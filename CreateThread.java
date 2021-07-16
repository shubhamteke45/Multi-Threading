package MultiThreading;

public class CreateThread {

	public static void main(String[] args) {

		//MyThread1 class 
		MyThread1 mt1 = new MyThread1();
		mt1.start();
		
		//MyThread2 class
		MyThread2 mt2 = new MyThread2();
		Thread t = new Thread(mt2);
		t.start();
	}

}

class MyThread1 extends Thread{
	
	public void run() {
		System.out.println("using Thread class");
	}
}

class MyThread2 implements Runnable{
	
	public void run() {
		System.out.println("using Runnable interface");
	}
}
