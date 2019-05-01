package Producers_Consumers_Pattern;

public class Tester {

	public static void main(String[] args) {
		SingleElementBuffer buffer = new SingleElementBuffer();
		Thread producer = new Thread(new Producer(1, 1000, buffer));
		Thread consumer = new Thread(new Consumer(buffer));
		producer.start();
		consumer.start();
	}

}
