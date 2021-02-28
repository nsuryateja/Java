package dsjava;

public class Fact extends Thread {

	int num;

	public void run() {
		int num = (int) (Math.random() * 50) + 1;
		System.out.println("Number: " + num);
		System.out.println("Factorial of " + num + " is " + Factorial.fact(num));
		System.out.println("-----------");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Fact f = new Fact();
			f.start();
		}
	}

}
