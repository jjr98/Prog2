package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>{
	
	public void serialize (List <User> list) {
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.dat")))
			{
				for (User user : list) {
					oos.writeObject(user);
				}
				oos.flush();
			} catch (Exception e) {
				throw new RuntimeException();
			}
	}
	public List<User> deserialize() {
		List<User> list = new ArrayList<User>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.dat")))
		{
			while(true) 
			{
				User user = (User) ois.readObject();
				list.add(user);
			}
		} catch (EOFException eof) {			
			return list;
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
	}
}