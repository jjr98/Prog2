package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class MainRunnable {
	
	public static void main(String[] args) {
		YinYangRunnable yin = new YinYangRunnable("Yin");
		YinYangRunnable yang = new YinYangRunnable("Yang");
		Thread t1 = new Thread(yin);
		Thread t2 = new Thread(yang);
		
		try {
			t1.start();
			Thread.sleep(250);
			t2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
