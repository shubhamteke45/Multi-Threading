package MultiThreading;

public class ThreadUsingLamdaExpression{

	public static void main(String[] args) {
		
		Runnable th = () -> {
			for(int i=0;i<5;i++) {
				System.out.println("child thread using Lambda Expression");
			}
		};
		
		th.run();
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread ");
		}

	}

}
