package de.fhws.roemischj.Prog2.lektion18.uebung3;

import java.io.IOException;
import java.io.Writer;

public abstract class DecoratorWriter extends Writer{
	Writer writer;

	@Override
	public abstract void write(char[] cbuf, int off, int len) throws IOException;

	@Override
	public abstract void flush() throws IOException;

	@Override
	public abstract void close() throws IOException;
	
}
