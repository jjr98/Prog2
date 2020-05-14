package de.fhws.roemischj.Prog2.lektion19.uebung1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	static String msgToServer;
	static boolean beenden;
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try(Socket client = new Socket("localhost", 1337);
				OutputStream os = client.getOutputStream();
				InputStream is = client.getInputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				ObjectInputStream ois = new ObjectInputStream(is))
		{
			System.out.println("Gib deinen ersten Versuch ein: ");
			while(true) {
				if(!beenden)
					do {
						msgToServer = scanner.nextLine();
					}while(msgToServer.isEmpty());
				else
					msgToServer = "EXIT";
				
				oos.writeObject(new Rateversuch(msgToServer));
				oos.flush();

				Antwort serverAntwort;
				try{
					serverAntwort = (Antwort)ois.readObject();
				} catch(EOFException ose) {
					System.out.println("Spiel beendet");
					return;
				}
				if(!serverAntwort.beendet){
					System.out.println(serverAntwort.wort);
					System.out.println("Buchstabe " + msgToServer.toUpperCase().charAt(0) + (serverAntwort.buchstabeIstRichtig ? " richtig" : " falsch"));
					System.out.println(serverAntwort.hinweis);
				}
				else {
					System.out.println(serverAntwort.wort);
					if(serverAntwort.erraten) 
					{
						System.out.println("Du hast gewonnen!");
					}
					else
					{
						System.out.println("Du hast verloren!");
					}
					
					System.out.println("Nochmal spielen? (Y/N) ");
					beenden = scanner.nextLine().toUpperCase().charAt(0) == 'N'; 
					if(beenden)
						oos.writeObject(new Rateversuch("EXIT"));
					else {
						System.out.println("---- Neues Spiel ----");
						System.out.println("Erster Versuch: ");
					}
				}
			}
		}
		catch(Exception e)
		{
			scanner.close();
			e.printStackTrace();
		}
	}
}
