package de.fhws.roemischj.Prog2.lektion20.uebung4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SMSTest {

	@Test
	void testEncodeSMSText() {
		SMSCodierer smsCodierer = new SMSCodierer();
		smsCodierer.setZiffernMap();
		smsCodierer.encodeSMSText();
	}
}
