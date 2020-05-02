package de.fhws.roemischj.Prog2.lektion18.uebung2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	static String msgToServer;
	static String msgFromServer;

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try(Socket client = new Socket("localhost", 5002);
				OutputStream os = client.getOutputStream();
				InputStream is = client.getInputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				BufferedReader br = new BufferedReader(new InputStreamReader(is)))
		{
			while(true) {
				msgFromServer = br.readLine();
				if(msgFromServer == null) {
					System.out.println("Spiel beendet");
					break;
				}
				else if(msgFromServer.equals("gewonnen")) {
					System.out.println("Du hast gewonnen!");
					bw.write("EXIT\n");
					bw.flush();
					break;
				}
				else if(msgFromServer.equals("verloren")) {
					System.out.println("Du hast verloren!");
					bw.write("EXIT\n");
					bw.flush();
					break;
				}

				System.out.println(msgFromServer);
				msgToServer = scanner.nextLine();
				bw.write(msgToServer + "\n");
				bw.flush();
			}
		}
		catch(Exception e)
		{
			scanner.close();
			e.printStackTrace();
		}
	}
}
