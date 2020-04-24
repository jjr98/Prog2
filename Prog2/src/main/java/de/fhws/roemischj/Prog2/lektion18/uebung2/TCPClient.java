package de.fhws.roemischj.Prog2.lektion18.uebung2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final String HOST = "localhost";
		final int PORT = 5000;
		try(Socket connectionToServer = new Socket(HOST, PORT);
				OutputStream os = connectionToServer.getOutputStream();
				InputStream is = connectionToServer.getInputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
				BufferedReader br = new BufferedReader(new InputStreamReader(is)))
		{
			while(true) {
				printWord(br.readLine());
				
				System.out.println("Gib einen Buchstaben ein: ");
				char eingabe = s.nextLine().charAt(0);
				
				bw.write(eingabe + "\n");
				bw.flush();
				
				if(br.readLine().equals("Ok")) {
					if(br.readLine().equals("gewonnen") || br.readLine().equals("verloren")) {
						System.out.println(br.readLine());
						break;
					}
				}
				
			}
		}
		catch(Exception e){
			
		}
	}

	private static void printWord(String word) {
		char[] c = word.toCharArray();
		System.out.println("Gesuchtes Wort:\n");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
