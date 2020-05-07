package de.fhws.roemischj.Prog2.lektion19.uebung1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	static String[] woerter = new String[]{"Programmiersprache", "Galgen", "Wolkenkratzer", "Dampfwalze", "Diskothek", 
			"Benzin", "Palette", "reinigen", "Knie", "Dreieck", "Augenklappe", "Skalpell", "Attraktion", "Zensur", 
			"Infusion", "Gaensebluemchen", "Mechanik", "Zebra", "Dompteur", "Bullshit"};
	static char[] suchwort;
	static char[] ratewort;
	static int aktuellerVersuch;
	static int anzahlVersuche = 15;
	static boolean exit = false;
	static boolean beendet;
	static boolean wortErraten;
	static boolean buchstabeIstRichtig;
	static char guess;
	static String clientmsg;

//	static ServerSocket ss;
//	static Socket connection;
//	static InputStream is;
//	static ObjectInputStream ois;
//	static OutputStream os;
//	static ObjectOutputStream oos;
//	
	public static void main(String[] args) {
		
		System.out.println("Starte Server...");
		
		try(
			ServerSocket ss = new ServerSocket(1337);
			Socket connection = ss.accept();
			InputStream is = connection.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			OutputStream os = connection.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);)
		{
			System.out.println("Server bereit");

			while(!exit) {
				initHangman();
				play(ois, oos);			
			}
			
//			oos.close();
//			os.close();
//			ois.close();
//			is.close();
//			connection.close();
//			ss.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//
	public static void initHangman() {
		suchwort = woerter[(int)(Math.random()*woerter.length)].toUpperCase().toCharArray();
		ratewort = new char[suchwort.length];
		Arrays.fill(ratewort, '_');
		aktuellerVersuch = 1;
		beendet = false;
	}
	
	// 
	public static void play(ObjectInputStream ois, ObjectOutputStream oos) throws IOException {
		do
		{
			Rateversuch rateversuch = null;
			try {
				rateversuch = (Rateversuch)ois.readObject();
				clientmsg = rateversuch.versuch.toUpperCase();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NullPointerException npe) {
				npe.printStackTrace();
			}
			
			if(clientmsg.equals("EXIT"))
			{
				exit = true;
				return;
			}
			
            wortErraten = true;
            buchstabeIstRichtig = false;
            if(clientmsg.isEmpty())
            	guess = ' ';
            else
            	guess = clientmsg.charAt(0);
            
            // prüfen und ersetzen
            for(int i = 0; i < suchwort.length; i++)
            {
                if(guess == suchwort[i])
                {
                    ratewort[i] = guess;
                    buchstabeIstRichtig = true;
                }
                // prüfen ob noch ein _ vorhanden ist
                else if(ratewort[i] == '_')
                {
                    wortErraten = false;
                }
            }
            if(anzahlVersuche == aktuellerVersuch++|| wortErraten) beendet = true;
            
            Antwort antwort = new Antwort(String.valueOf(ratewort), "verbeibende Versuche: " + (anzahlVersuche - aktuellerVersuch), wortErraten, beendet, buchstabeIstRichtig);
			oos.writeObject(antwort);
            oos.flush();
            
		}while(!beendet);
	}
}
