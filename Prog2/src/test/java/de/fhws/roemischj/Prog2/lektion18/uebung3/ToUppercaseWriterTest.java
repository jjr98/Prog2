package de.fhws.roemischj.Prog2.lektion18.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;

class ToUppercaseWriterTest {

	@Test
	public void writeCharTestWithChar() {
		assertEquals("A", writeCharTest('a'));
	}
	
	@Test
	public void writeCharTestWithNonChar() {
		assertEquals("1", writeCharTest('1'));
	}
	
	@Test
	public void writeCharTestWithASCII128() {
		for(int i = 0; i < 128; i++) {
			if(i >= 97 && i <= 122)
				assertEquals(String.valueOf((char)i).toUpperCase(), writeCharTest((char)i));
			else
				assertEquals(String.valueOf((char)i), writeCharTest((char)i));
		}
	}
	
	public String writeCharTest(char c) {
		try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(baos);
				ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);)
		{
			writer.write(c);
			writer.flush();
			String uppercase = baos.toString();
			return uppercase;
		}
		catch (IOException e)
		{
			fail("IOException" + e.getMessage());
			return null;
		}
	}
		
}
