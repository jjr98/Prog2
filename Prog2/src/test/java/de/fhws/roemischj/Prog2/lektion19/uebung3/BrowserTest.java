package de.fhws.roemischj.Prog2.lektion19.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class BrowserTest {

	@Test
	void testBack() {
//		System.out.println("Normal back");
		Browser browser = new Browser();
		Optional<URL> back = browser.back();
		String adresse = "";
		
//		back.ifPresent(url -> {browser.retrieveSite(url);} );
//		if(back.isPresent()) 
//			adresse = browser.retrieveSite(back.get());
		assertEquals("http://google.de", adresse);
		
		browser.back().ifPresent(url -> browser.retrieveSite(url));

	}
}
