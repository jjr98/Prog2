package de.fhws.roemischj.Prog2.lektion18.uebung3;

import java.io.IOException;
import java.io.Writer;

public class ToUpperCaseWriter extends DecoratorWriter{

	public ToUpperCaseWriter(Writer writer) {
		this.writer = writer;
	}
	
	public void write(char c) throws IOException {
		writer.write(Character.toUpperCase(c));
	}
	
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		for (int i = off; i < off+len; i++) {
			write(cbuf[i]);
		}
	}
	
	public void write(String str, int off, int len) throws IOException {
		for (int i = off; i < off+len; i++) {
			write(str.charAt(i));
		}
	}

	@Override
	public void flush() throws IOException {
		writer.flush();
	}

	@Override
	public void close() throws IOException {
		writer.close();
	}

}
