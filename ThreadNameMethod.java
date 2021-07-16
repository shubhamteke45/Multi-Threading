package MultiThreading;

public class ThreadNameMethod {

	public static void main(String[] args) {
		
		System.out.println("Original Name of Main Thread: "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("Shubham");
		
		System.out.println("After changing Name of Main Thread: "+Thread.currentThread().getName());

		//below line will print exception in thread Shubham
		System.out.println(10/0); 

	}
}


