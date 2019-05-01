package Producers_Consumers_Pattern;

public class Producer implements Runnable {
	private int startValue;
	private final int period;
	private final SingleElementBuffer buffer;

	Producer(int startValue, int period, SingleElementBuffer buffer){
		this.buffer = buffer;
		this.startValue = startValue;
		this.period = period;
	}
	
	@Override
	public void run() {
		while(true) {
			try{
				System.out.println(startValue + "produced");
				buffer.put(startValue++);
				Thread.sleep(period);
			}catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName());
			}
		}

	}

}
