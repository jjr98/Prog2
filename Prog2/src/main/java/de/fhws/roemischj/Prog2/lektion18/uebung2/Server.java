package de.fhws.roemischj.Prog2.lektion18.uebung2;

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
	static int versuch;
	static boolean erraten;
	static char guess;
	static String clientmsg;

	
	public static void main(String[] args) {
		
		System.out.println("Starte Server...");
		
		try(ServerSocket ss = new ServerSocket(5002);
				Socket connection = ss.accept();
				InputStream is = connection.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				OutputStream os = connection.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));)
		{
			System.out.println("Server bereit");
			
			initHangman();
			
			while(true) {
				bw.write(versuch + ". Versuch: " + String.valueOf(ratewort) + "\n");
				bw.flush();
				clientmsg = br.readLine().toUpperCase();
				if(clientmsg.equals("EXIT"))
				{
					break;
				}
				
	            erraten = true;
	            if(clientmsg.isEmpty())
	            	guess = ' ';
	            else
	            	guess = clientmsg.toUpperCase().charAt(0);
	            
	            // prüfen und ersetzen
	            for(int i = 0; i<suchwort.length; i++)
	            {
	                if(guess == suchwort[i])
	                {
	                    ratewort[i] = guess;
	                }
	                // prüfen ob noch ein _ vorhanden ist
	                else if(ratewort[i] == '_')
	                {
	                    erraten = false;
	                }
	            }
	            
	            if(erraten) 
	            	bw.write("gewonnen\n");
	            else if(versuch>=15) 
	            	bw.write("verloren\n");
	            else 
	            	versuch++;
				bw.flush();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initHangman() {
		suchwort = woerter[(int)(Math.random()*woerter.length)].toUpperCase().toCharArray();
		ratewort = new char[suchwort.length];
		Arrays.fill(ratewort, '_');
		versuch = 1;
	}
}
