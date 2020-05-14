package de.fhws.roemischj.Prog2.lektion16.uebung1;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    // Erg�nzen Sie den Algorithmus zur Bestimmung der Felder
    int tempx, tempy;
    
    //nach links oben
    tempx = x-1;
    tempy = y-1;
    while(tempx > 0 && tempy > 0) {
    	brett.markiereFeld(tempx--, tempy--);
    }
    //nach links unten
    tempx = x-1;
    tempy = y-1;
    while(tempx > 0 && tempy < 8) {
    	brett.markiereFeld(tempx--, tempy++);
    }
    
    //nach rechts unten
    tempx = x-1;
    tempy = y-1;
    while(tempx < 8 && tempy < 8) {
    	brett.markiereFeld(tempx++, tempy++);
    }
    
    //nach rechts oben
    tempx = x-1;
    tempy = y-1;
    while(tempx < 8 && tempy > 0) {
    	brett.markiereFeld(tempx++, tempy--);
    }
    
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
