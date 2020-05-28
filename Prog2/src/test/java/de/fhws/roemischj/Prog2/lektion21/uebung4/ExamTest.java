package de.fhws.roemischj.Prog2.lektion21.uebung4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ExamTest {

	@Test
	void testExam() throws IOException {
		Exam exam = new Exam();
		exam.readQuestions();
		exam.toTest();
		
	/*
		exam.readQuestions().toTest();
		
		readQuestion has to return an Exam-Object
	
	*/
		File file = new File("test.tex");
		assertTrue(file.exists());
	}

}
