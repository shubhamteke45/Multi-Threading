package MultiThreading;

public class Synchronization extends Thread{
	
	static ThreadSynchronization ts;
	int ticket;
	public void run() {
		ts.book(ticket);
	}
	public static void main(String[] args) {
		
		ts = new ThreadSynchronization();
		
		Synchronization s1 = new Synchronization();
		s1.ticket=7;
		s1.start();
		
		Synchronization s2 = new Synchronization();
		s2.ticket=5;
		s2.start();
	}
}

class ThreadSynchronization{
	
	private int totalTicket = 10;
	
	public synchronized void book(int ticket) {
		
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
}
