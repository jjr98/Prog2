package de.fhws.roemischj.Prog2.lektion20.uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SMSCodierer {
	
	Map<Character, Character> ziffernMap = new HashMap<>(26);
	
	public void setZiffernMap() {
		ziffernMap.put('A', '2');
		ziffernMap.put('B', '2');
		ziffernMap.put('C', '2');
		ziffernMap.put('D', '3');
		ziffernMap.put('E', '3');
		ziffernMap.put('F', '3');
		ziffernMap.put('G', '4');
		ziffernMap.put('H', '4');
		ziffernMap.put('I', '4');
		ziffernMap.put('J', '5');
		ziffernMap.put('K', '5');
		ziffernMap.put('L', '5');
		ziffernMap.put('M', '6');
		ziffernMap.put('N', '6');
		ziffernMap.put('O', '6');
		ziffernMap.put('P', '7');
		ziffernMap.put('Q', '7');
		ziffernMap.put('R', '7');
		ziffernMap.put('S', '7');
		ziffernMap.put('T', '8');
		ziffernMap.put('U', '8');
		ziffernMap.put('V', '8');
		ziffernMap.put('W', '9');
		ziffernMap.put('X', '9');
		ziffernMap.put('Y', '9');
		ziffernMap.put('Z', '9');
	}
	
	public void encodeSMSText() {
		try(FileReader fr = new FileReader("C:\\Users\\jjr98\\Documents\\GitHub\\Prog2\\Prog2\\src\\main\\java\\de\\fhws\\roemischj\\Prog2\\lektion20\\uebung4\\Zeichenkontakte.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("C:\\Users\\jjr98\\Documents\\GitHub\\Prog2\\Prog2\\src\\main\\java\\de\\fhws\\roemischj\\Prog2\\lektion20\\uebung4\\Nummernkontakte.txt");
				BufferedWriter bw = new BufferedWriter(fw);
		)
		{
			String sms;
			while((sms = br.readLine()) != null ) {
				char[] smsArray = sms.toCharArray();
				for(int i = 0; i < sms.length(); i++)
				{
					try
					{
						if(ziffernMap.containsKey(smsArray[i]))
							smsArray[i] = ziffernMap.get(smsArray[i]);
						else {
							smsArray[i] = '?';
							throw new IllegalTelephoneNumberException(String.valueOf(smsArray[i]));
						}
					}
					catch(IllegalTelephoneNumberException e)
					{
						System.out.println("Ungültiges Zeichen " + e.getMessage());
					}
				}
				bw.write(smsArray);
				bw.flush();
			}
		}
		catch(IOException io) {
			io.printStackTrace();
		}
				
	}
}
