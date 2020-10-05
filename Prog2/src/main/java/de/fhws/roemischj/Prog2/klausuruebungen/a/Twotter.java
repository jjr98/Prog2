package de.fhws.roemischj.Prog2.klausuruebungen.a;

public class Twotter {

	public static void main ( String [] args ){

		TwotterSystem sys = new TwotterSystem ();
		User u = ...
				sys . addMessage (u , new Message (" Hello World " ));
		List < Message > a = sys . getAllMessages ();
		List < Message > m = sys . getAllMessagesFromDate (" 2018 -01 -31 " );
		List < Message > d = sys . getAllMessagesFromUser (u );
	}
}