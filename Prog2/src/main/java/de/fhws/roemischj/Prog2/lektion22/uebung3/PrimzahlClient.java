package de.fhws.roemischj.Prog2.lektion22.uebung3;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PrimzahlClient implements Runnable
{
	List<Integer> zahlenZumTesten = new ArrayList<>();

	public PrimzahlClient(List<Integer> zahlenZumTesten) 
	{
		this.zahlenZumTesten = zahlenZumTesten;
	}
	
	public static void main(String[] args) 
	{
		PrimzahlClient c1 = new PrimzahlClient(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		PrimzahlClient c2 = new PrimzahlClient(new ArrayList<Integer>(Arrays.asList(11,12,13,14,15,16,17,18,19,20)));
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() 
	{
		try(Socket client = new Socket("localhost", 8005);
				OutputStream os = client.getOutputStream();
				InputStream is = client.getInputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				ObjectInputStream ois = new ObjectInputStream(is);)
		{
			oos.writeObject(new ClientAnfrage(zahlenZumTesten));
			oos.flush();
			ServerAntwort sa = (ServerAntwort)ois.readObject();
			gebeErgebnisAus(sa.ergebnis);
			
		} catch (UnknownHostException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void gebeErgebnisAus(Map<Integer, Boolean> map) 
	{
		for(Integer zahl : map.keySet()) 
		{
			System.out.println(zahl + " -> " + map.get(zahl));
		}
	}
}
