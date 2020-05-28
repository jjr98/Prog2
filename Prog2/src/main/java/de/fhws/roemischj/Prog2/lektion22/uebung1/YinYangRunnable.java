package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class YinYangRunnable implements Runnable {

	public String nachricht;
	
	public YinYangRunnable(String nachricht) {
		this.nachricht = nachricht;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(nachricht);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
