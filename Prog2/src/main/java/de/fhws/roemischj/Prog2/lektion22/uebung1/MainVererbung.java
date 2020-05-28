package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class MainVererbung {

	public static void main(String[] args) {
		YinYangVererbung yinThread = new YinYangVererbung("Yin");
		YinYangVererbung yangThread = new YinYangVererbung("Yang");
		
		try {
			yinThread.start();
			Thread.sleep(250);
			yangThread.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
