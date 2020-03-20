package de.fhws.roemischj.Prog2.lektion1;

public class Kugelvolumen
	{
	public static double berechneKugelvolumen(double radius) 
	{
		if(radius<0){
			throw new IllegalArgumentException("Radius darf nicht negativ sein.");
		}
		else
		{
			return (double)4/3*Math.PI*radius*radius*radius;
		}
	}
}