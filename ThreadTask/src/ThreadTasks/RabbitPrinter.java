package ThreadTasks;

public class RabbitPrinter implements Runnable {

	private String msg;
	long sleep;

	RabbitPrinter(String msg, long sleep) {
		this.msg = msg;
		this.sleep = sleep;
	}
   
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
