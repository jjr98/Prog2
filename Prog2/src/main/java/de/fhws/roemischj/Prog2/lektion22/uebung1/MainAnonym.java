package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class MainAnonym {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("Yin");
						sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println("Yang");
						sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		try {
			t1.start();
			Thread.sleep(250);
			t2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
