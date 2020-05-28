package de.fhws.roemischj.Prog2.lektion22.uebung3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimzahlServer {

	public static void main(String[] args) {
		class PrimzahlThread extends Thread{
			List<Integer> zahlenZumTesten = new ArrayList<>();
			Map<Integer, Boolean> ergebnis = new HashMap<>();
			Socket connection;
			
			public PrimzahlThread(Socket connection) {
				this.connection = connection;
			}
			
			public boolean testeObPrimzahl(int zahl) {
				if (zahl < 2) return false;
				for (int divisor = 2; divisor < zahl; divisor++)
					if (zahl% divisor == 0) return false;
				return true;
			}
			
			@Override
			public void run() {
				try(ObjectInputStream ois = new ObjectInputStream(connection.getInputStream());
						ObjectOutputStream oos = new ObjectOutputStream(connection.getOutputStream());)
				{
					ClientAnfrage ca = (ClientAnfrage) ois.readObject();
					this.zahlenZumTesten = ca.zahlenZumTesten;
					
					for (Integer zahl : zahlenZumTesten) {
						ergebnis.put(zahl, testeObPrimzahl(zahl));
					}
					
					oos.writeObject((new ServerAntwort(ergebnis)));
					oos.flush();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Starte Server...");

		try(
				ServerSocket ss = new ServerSocket(5000);
				Socket connection = ss.accept();)
		{
			while(true) {
				System.out.println("Server bereit");
			
			
				Thread thread = new PrimzahlThread(connection);
				thread.start();
				
				Thread.sleep(5000);
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
