package hw3;

class OneSec implements Runnable{
	
	public void run() {
		boolean isRunning1 = true;
		int counter1 = 0;
		while(isRunning1) {
			try
			{
				counter1++;
				Thread.sleep(1000);
				System.out.println(counter1);
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
		}
	}
}

class ThreeSec implements Runnable{
	
	public void run() {
		boolean isRunning2 = true;
		int counter2 = 0;
		while(isRunning2) {
			try
			{
				counter2++;
				Thread.sleep(3000);
				System.out.println("\t" + counter2);
			}
			catch(InterruptedException ex) {
				System.out.println("The thread was interrupted");
			}
		}
	}
}

public class Threading_Part1 {
	
	public static void main(String [] args) {

		Thread t = new Thread(new OneSec());
		Thread t2 = new Thread(new ThreeSec());
		t.start();
		t2.start();
	}
	
}
