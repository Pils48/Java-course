package Producers_Consumers_Pattern;

public class SingleElementBuffer {
	private Integer elem = null;

	public synchronized int get() throws InterruptedException {
		while (elem == null) {
			this.wait();
		}
		int result = this.elem;
		this.elem = null;
		this.notifyAll();
		return result;
	}

	public synchronized void put(Integer newElem) throws InterruptedException {
		while (elem != null) {
			this.wait();
		}
		elem = newElem;
		this.notifyAll();
	}

}
