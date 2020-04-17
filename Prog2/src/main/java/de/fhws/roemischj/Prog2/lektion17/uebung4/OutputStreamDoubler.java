package de.fhws.roemischj.Prog2.lektion17.uebung4;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDoubler extends OutputStream{
	private OutputStream os1;
	private OutputStream os2;
	
	public OutputStreamDoubler(OutputStream os1, OutputStream os2) {
		this.os1 = os1;
		this.os2 = os2;
	}
	
	public OutputStream getOs1() {
		return os1;
	}


	public void setOs1(OutputStream os1) {
		this.os1 = os1;
	}


	public OutputStream getOs2() {
		return os2;
	}


	public void setOs2(OutputStream os2) {
		this.os2 = os2;
	}

	@Override
	public void close() throws IOException{
		os1.close();
		os2.close();
	}
	
	@Override
	public void write(int b) throws IOException {
		boolean exceptionAufgetreten = false;
		try {
			os1.write(b);
		}
		catch(IOException e){
			exceptionAufgetreten = true;
		}
		try {
			os2.write(b);
		}
		catch(IOException e){
			exceptionAufgetreten = true;
		}
		if(exceptionAufgetreten)
			throw new IOException(); 
		else
			return;
	}
}
