package de.fhws.roemischj.Prog2.lektion17.uebung4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
		int b;
		
		try(InputStream is = new FileInputStream("test.txt");
				FileOutputStream fis1 = new FileOutputStream("file1.txt");
				FileOutputStream fis2 = new FileOutputStream("file2.txt");)
		{
			OutputStreamDoubler osd = new OutputStreamDoubler(fis1, fis2);
			do {
				b = is.read();
				if(b != -1) osd.write(b);
			}while(b != -1);
			osd.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
