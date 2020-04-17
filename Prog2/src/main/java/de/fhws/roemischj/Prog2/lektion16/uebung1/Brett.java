package de.fhws.roemischj.Prog2.lektion16.uebung1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }
  
  public Brett kombiniere(Brett brett2) {
	  Brett kombiBrett = new Brett();
	  for (int x = 1; x <= brett.length; x++) {
		for (int y = 1; y <= brett[0].length; y++) {
			if(this.gibFeld(x, y) || brett2.gibFeld(x, y)) {
				kombiBrett.markiereFeld(x, y);				
			}
		}
	  }
	  return kombiBrett;
  }
  
}
