package de.fhws.roemischj.Prog2.lektion21.uebung1;

public class Naehrstoffangaben {
	double portionsgroesse;
	int anzahlPortionen;
	double eiweiß;
	double fett;
	double kohlenhydrate;
	double natrium;
	
	private Naehrstoffangaben(double portionsgroesse, int anzahlPortionen, double eiweiß, double fett,
			double kohlenhydrate, double natrium) {
		this.portionsgroesse = portionsgroesse;
		this.anzahlPortionen = anzahlPortionen;
		this.eiweiß = eiweiß;
		this.fett = fett;
		this.kohlenhydrate = kohlenhydrate;
		this.natrium = natrium;
	}

	public double getPortionsgroesse() {
		return portionsgroesse;
	}

	public int getAnzahlPortionen() {
		return anzahlPortionen;
	}

	public double getEiweiß() {
		return eiweiß;
	}

	public double getFett() {
		return fett;
	}

	public double getKohlenhydrate() {
		return kohlenhydrate;
	}

	public double getNatrium() {
		return natrium;
	}
	
	public class NaehrstoffangabenBuilder {
		double portionsgroesse;
		int anzahlPortionen;
		double eiweiß;
		double fett;
		double kohlenhydrate;
		double natrium;
		
		private NaehrstoffangabenBuilder(double portionsgroesse, int anzahlPortionen) {
			this.portionsgroesse = portionsgroesse;
			this.anzahlPortionen = anzahlPortionen;
		}

		private NaehrstoffangabenBuilder withEiweiß(double eiweiß) {
			this.eiweiß = eiweiß;
			return this;
		}

		private NaehrstoffangabenBuilder withFett(double fett) {
			this.fett = fett;
			return this;
		}

		private NaehrstoffangabenBuilder withKohlenhydrate(double kohlenhydrate) {
			this.kohlenhydrate = kohlenhydrate;
			return this;
		}

		private NaehrstoffangabenBuilder withNatrium(double natrium) {
			this.natrium = natrium;
			return this;
		}
		
		public Naehrstoffangaben build() {
			return new Naehrstoffangaben(portionsgroesse, anzahlPortionen, eiweiß, fett, kohlenhydrate, natrium);
		}
	}
	
}
