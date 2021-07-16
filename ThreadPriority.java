package MultiThreading;

//In windows priority is not supported

public class ThreadPriority extends Thread{

	public static void main(String[] args) {
		
		//Main Thread default priority
		System.out.println("Main Thread Default Priority: "+Thread.currentThread().getPriority());
		
		//changing main thread priority
		Thread.currentThread().setPriority(1);
		
		System.out.println("Main Thread new Priority: "+Thread.currentThread().getPriority());
		
		Priority p1 = new Priority();
		p1.start();
		
		//Thread p2 having priority 5 because NORM_PRIORITY is 5
		Priority p2 = new Priority();
		p2.setPriority(NORM_PRIORITY);
		p2.start();
		
		//Thread p3 having priority 8 because we are setting it using method
		Priority p3 = new Priority();
		p3.setPriority(8);
		p3.start();
		
	}
}

class Priority extends Thread{
	
	public void run() {
		
		System.out.print(Thread.currentThread().getName()+" ");
		//child thread priority get inherited from parent thread in this Main thread is parent thread
		System.out.println("child Thread priority: "+Thread.currentThread().getPriority());
	}
}
