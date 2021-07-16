package MultiThreading;

public class MultiTaskMultiThread {

	public static void main(String[] args) {
		
		//It wil start thread Video
		Video v = new Video();
		v.start(); 

		//It wil start thread Music
		Music m = new Music();
		m.start(); 

		//It wil start thread Time
		Time t = new Time();
		t.start(); 
	}

}

class Video extends Thread
{
	public void run()
	{
		System.out.println("Playing Video");
	}
}

class Music extends Thread
{
	public void run()
	{
		System.out.println("Playing Music");
	}
}

class Time extends Thread
{
	public void run()
	{
		System.out.println("Timer");
	}
}


