package de.fhws.roemischj.Prog2.lektion17.uebung3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeitmessungStreamsTest {

	@Test
	void test() {
//		assertTrue(ZeitmessungStreams.messeZeitDifferenz() > 0);
		System.out.println(String.format("%.2f%% Zeitersparnis durch BufferedIOStreams!", ZeitmessungStreams.messeZeitDifferenz(100)*100));
	}

}
