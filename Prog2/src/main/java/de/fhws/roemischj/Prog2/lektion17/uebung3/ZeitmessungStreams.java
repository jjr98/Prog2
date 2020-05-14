package de.fhws.roemischj.Prog2.lektion17.uebung3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ZeitmessungStreams {
	
	public static String leseQuellDateipfad() {
		Scanner s = new Scanner(System.in);
		String source;
		do {
			System.out.println("Gib den Pfad zu einer Musikdatei an: ");
			source = s.nextLine();
			try {
				FileInputStream test = new FileInputStream(source);
				s.close();
				test.close();
				return source;
			} catch (/*FileNotFoundException |*/ IOException e) {
				System.out.println("Datei nicht gefunden.");
				continue;
			}
		}while(true);
	}
	
	public static void copy(InputStream is, OutputStream os) throws IOException{
		byte[] b = new byte[4096];
		int n;
		do {
			n = is.read(b);
			if(n != -1) os.write(b, 0, n);
		}while(n != -1);
	}
	
	public static void bufferedCopyFile(FileInputStream fis, FileOutputStream fos) {
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		unbufferedCopyFile(bis, bos);
	}
	
	public static void unbufferedCopyFile(InputStream fis, OutputStream fos) {
		try
		{
			copy(fis, fos);
			fis.close();
			fos.close();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "null", "resource" })
	public static float messeZeitDifferenz(int anzahlTests) {
		long durationbuffered = 0;
		long durationunbuffered = 0;
		String source = ZeitmessungStreams.leseQuellDateipfad();
		String dest = "test.mp3";
		
		for (int i = 0; i < anzahlTests; i++) {
			FileInputStream fis;
			FileOutputStream fos;
			try {
				fis = new FileInputStream(source);
			} catch (FileNotFoundException e) {
				System.out.println("Quelldatei nicht gefunden");
				return (Long) null;
			}
			try {
				fos = new FileOutputStream(dest);
			} catch (FileNotFoundException e) {
				System.out.println("Fehlerhafte Zieldatei");
				return (Long) null;
			}
			long startTime = System.nanoTime();
			ZeitmessungStreams.unbufferedCopyFile(fis, fos);
			long endTime = System.nanoTime();
			durationunbuffered += endTime - startTime;
			
			//neu öffnen
			try {
				fis = new FileInputStream(source);
			} catch (FileNotFoundException e) {
				System.out.println("Quelldatei nicht gefunden");
				return (Long) null;
			}
			try {
				fos = new FileOutputStream(dest);
			} catch (FileNotFoundException e) {
				System.out.println("Fehlerhafte Zieldatei");
				return (Long) null;
			}
			
			startTime = System.nanoTime();
			ZeitmessungStreams.bufferedCopyFile(fis, fos);
			endTime = System.nanoTime();
			durationbuffered += endTime - startTime;
		}
		float zeitersparnis = (float)(durationunbuffered - durationbuffered) / (float)durationunbuffered;
		return zeitersparnis;
		
	}
}
