package ThreadTasks;

import java.lang.*;

public class ThreadTSK_1 {

	public static void main(String[] args) throws InterruptedException {

		Thread controller = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					Runnable printerA = new PrinterRunnable("A   .", 100);
					Thread threadA = new Thread(printerA);
					Thread threadB = new Thread(new PrinterRunnable(".      B", 99));
					Thread threadC = new Thread(new PrinterRunnable("  C", 10));
					threadA.start();
					threadB.start();
					try {
						threadA.join();
						threadB.join();
					} catch (InterruptedException e) {
						// None
						e.printStackTrace();
					}
					System.out.println("--------");
					threadC.start();
					try {
						threadC.join();
					} catch (InterruptedException e) {
						// None
						e.printStackTrace();
					}
				}
			}
		});
		controller.start();
		controller.join();
		System.out.println("It's certainly the end!");
	}

}
