package de.fhws.roemischj.Prog2.lektion22.uebung1;

public class YinYangVererbung extends Thread{
	public String nachricht;
	
	public YinYangVererbung(String nachricht) {
		this.nachricht = nachricht;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(nachricht);
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
