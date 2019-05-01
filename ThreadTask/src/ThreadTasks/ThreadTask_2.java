package ThreadTasks;

public class ThreadTask_2 {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 1; i < 1000; i++) {
			String spaces = spaces(i);
			Runnable printer = new RabbitPrinter(spaces + i, 100);
			Thread thread = new Thread(printer);
			thread.start();
			Thread.sleep(100);
		}

	}
	
	public static String spaces(int k) {
		String result = "";
		for (int i = 0; i < k; i++) {
			result += " ";
		}
		return result;
	}

}
