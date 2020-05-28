package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class MainA extends Thread{

	public static void main(String[] args) {
		YangThread yangThread = new YangThread();
		yangThread.start();
		try {
			sleep(250);
			while(true) {
				System.out.println("Yin");
				sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void runYin() {
		
	}

}
