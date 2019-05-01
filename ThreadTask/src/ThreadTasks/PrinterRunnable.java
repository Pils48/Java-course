package ThreadTasks;

public class PrinterRunnable implements Runnable {
	
	private String msg;
	private long pause;
  
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	PrinterRunnable(String msg, long pause) {
		this.msg = msg;
		this.pause = pause;
	}
}

