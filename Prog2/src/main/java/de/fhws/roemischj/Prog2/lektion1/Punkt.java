package de.fhws.roemischj.Prog2.lektion1;

public class Punkt
{
	int x;
	int y;
	
	public Punkt() {
		x=0;
		y=0;
	}
	
	public void verschiebePunkt(int zielX, int zielY) {
		if(zielX < 0 || zielY < 0) {
			throw new RuntimeException("Koordinaten dÃ¼rfen nicht negativ sein");
		}
		else if(zielX > 1920) {
			throw new RuntimeException("UngÃ¼ltige x-Koordinate");
		}
		else if(zielY > 1080) {
			throw new RuntimeException("UngÃ¼ltige y-Koordinate");
		}
		else {
			x = zielX;
			y = zielY;
		}
	}
}