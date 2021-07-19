package MultiThreading;

public class SynchronizedBlock extends Thread{

	static ThreadBlockSynchronization ts;
	int ticket;
	
	public void run() {
		ts.book(ticket);
	}
	
	public static void main(String[] args) {
		
		ts = new ThreadBlockSynchronization();

		SynchronizedBlock s1 = new SynchronizedBlock();
		s1.ticket=7;
		s1.start();
		
		SynchronizedBlock s2 = new SynchronizedBlock();
		s2.ticket=5;
		s2.start();
	}
}

class ThreadBlockSynchronization{
	
	private int totalTicket = 10;
	
	public void book(int ticket) {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this) {
			if(totalTicket >= ticket) {
				System.out.println("Successfully booked ticket: "+ticket);
				totalTicket = totalTicket - ticket;
				System.out.println("Remaining tickets: "+totalTicket);
			}
			else {
				System.out.println("Failed to book ticket");
				System.out.println("Ticket left only: "+totalTicket);
			}
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}

