package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwotterSystem {
	HashMap<User, List<Message>> map = new HashMap<User, List<Message>>();
		
	public void addMessage(User user, Message message) {
		ArrayList<Message> messages = new ArrayList<Message>();
		if(map.keySet().contains(user)) 
		{
			messages = (ArrayList<Message>) map.get(user);
		}
		messages.add(message);
		map.put(user, messages);
	}
	
	public List<Message> getAllMessages() {
		List<Message> allMessages = new ArrayList<>();
		List<List<Message>> values = (List<List<Message>>)map.values();

		for(List<Message> list : values) {
			for(Message m : list) {
				allMessages.add(m);
			}
		}
		return allMessages;
	}
	
	public List<Message> getAllMessagesFromUser(User u) {
		return map.get(u);
	}
	
	public List<Message> getAllMessagesFromDate(String date) {
		List<Message> ret = new ArrayList<>();
		List<List<Message>> allValues = (List<List<Message>>)map.values();

		for(List<Message> list : allValues) {
			for(Message m : list) {
				if(m.getCreationDate().equals(date)) {
					ret.add(m);
				}
			}
		}
		return ret;
	}
}
