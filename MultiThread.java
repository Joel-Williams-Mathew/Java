
import java.util.Random;
class EvenThread extends Thread {
	private int num;
	public EvenThread ( int num) {
		super("Even");
		this.num = num;
		start();
	}
	public void run() {
		System.out.println ("Square of num "+num+"="+num*num);
	}
}

class OddThread extends Thread {
	private int num;
	public OddThread (int num) {
		super("Odd");
		this.num = num;
		start();
	}
	public void run() {
		System.out.println ("Cube of num "+num+"="+num*num*num);
	}
}

class RandomThread extends Thread {
	RandomThread() {
		super("Random Thread");
		start();
	}
	public void run() {
		Random r = new Random();
		try {
			for(int i =0; i<10; i++) {
				int num = r.nextInt(100);
				Thread.sleep(1000);
				if(num%2 == 0) {
					new EvenThread(num);
				}
				else {
					new OddThread(num);
				}
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class MultiThread {
	public static void main(String[] args) {
		RandomThread r = new RandomThread();
	}
}
