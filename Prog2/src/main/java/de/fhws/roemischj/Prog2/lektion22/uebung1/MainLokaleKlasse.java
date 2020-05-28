package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class MainLokaleKlasse {

	public static void main(String[] args) {
		class YinYangLokal extends Thread{
			String nachricht;
			
			YinYangLokal(String nachricht){
				this.nachricht = nachricht;
			}
			
			@Override
			public void run() {
				try {
					while(true) {
						System.out.println(nachricht);
						sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		YinYangLokal t1 = new YinYangLokal("Yin");
		YinYangLokal t2 = new YinYangLokal("Yang");
		
		try {
			t1.start();
			Thread.sleep(250);
			t2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
