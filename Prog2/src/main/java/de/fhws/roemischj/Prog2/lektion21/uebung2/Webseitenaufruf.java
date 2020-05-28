package de.fhws.roemischj.Prog2.lektion21.uebung2;


import javax.ws.rs.client.*;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.*;

public class Webseitenaufruf {

	public static void main(String[] args) throws NumberFormatException {
//		Response response = ClientBuilder.newClient()
//				.target("https://en.wikipedia.org/")
//				.path("wiki/Fluent_interface")
//				.request(MediaType.TEXT_HTML)
//				.get();
//		String s = response.readEntity(String.class);
//		System.out.println(s);
		
		
//		Client c = ClientBuilder.newClient();
//		WebTarget target = c.target("https://jsonplaceholder.typicode.com/posts/1");
//		Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
//		Response response = builder.get();
		
		Response response = ClientBuilder.newClient()
				.target("https://jsonplaceholder.typicode.com/posts/1")
				.request(MediaType.APPLICATION_JSON_TYPE)
				.get();
		String s = response.readEntity(String.class);
		System.out.println(s);
	}

}
