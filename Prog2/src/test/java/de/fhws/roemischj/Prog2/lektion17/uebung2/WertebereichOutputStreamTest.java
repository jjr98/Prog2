package de.fhws.roemischj.Prog2.lektion17.uebung2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.jupiter.api.Test;

class WertebereichOutputStreamTest {

	@Test
	void test() {
		String input = "The quick brown fox jumps over the lazy dog.";
		byte[] b = input.getBytes();
		int off = 0;
		int len = b.length;
		try {
			OutputStream os = new FileOutputStream("test.txt");
			assertTrue(off <= input.getBytes().length);
			assertTrue(off >= 0);
			assertTrue(len + off <= input.getBytes().length);
			os.write(b, off, len);			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
