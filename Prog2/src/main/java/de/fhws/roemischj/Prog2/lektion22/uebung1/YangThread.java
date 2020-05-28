package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class YangThread extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Yang");
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
