package de.fhws.roemischj.Prog2.lektion17.uebung1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptiontest {
	public static void main(String[] args) throws FileNotFoundException {
		NumberFormatException();
		ArrayIndexOutOfBoundsExceptions();
		NullPointerException();
		OutOfMemoryError();
		FileNotFoundException();
		ArithmeticException();	
	}


	@SuppressWarnings("unused")
	public static void NumberFormatException() {
		String s = "keineZahl";
		int i = Integer.parseInt(s);
	}	
	public static void ArrayIndexOutOfBoundsExceptions() {
		int[] a = new int[5];
		a[6] = 6;
	}
	@SuppressWarnings("null")
	public static void NullPointerException() {
		String s = null;
		s.charAt(0);
	}
	public static void OutOfMemoryError() {
		@SuppressWarnings("unused")
		int[] i = new int[1000000000];
	}
	@SuppressWarnings({ "unused", "resource" })
	public static void FileNotFoundException() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream("file.txt");
	}
	@SuppressWarnings("unused")
	private static void ArithmeticException() {
		int i = 1/0;
	}
}
