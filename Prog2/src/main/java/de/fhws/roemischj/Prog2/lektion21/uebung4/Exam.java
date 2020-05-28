package de.fhws.roemischj.Prog2.lektion21.uebung4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exam {
	List<Question> exam = new ArrayList<>();
	
	public void toTest() throws IOException {
		try (FileWriter fw = new FileWriter("test.tex");
				BufferedWriter bw = new BufferedWriter(fw))
		{
			String header = readHeaderFromFile();
			bw.write(header);
			
			for(Question q : exam)
			{
				q.text = "\\textbf{" + q.text + "}\\\\";
				bw.write(q.text + "\n");
			}
			bw.write("\\end{document}");
		}
	}
	
	//Liest den Tex-Header aus einer Datei u. gibt ihn als String zurück
	String readHeaderFromFile() throws IOException 
	{
		try(FileReader fr = new FileReader("texHeader.tex");
				BufferedReader br = new BufferedReader(fr))
		{
			String header = "";
			while(true)
			{
				String line = br.readLine();
				if(line == null || line.contains("\\begin"))	
					break;
				header += line + "\n";
			}
			return header;
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public void readQuestions() throws IOException{
		try(FileReader fr = new FileReader("questions.csv");
				BufferedReader br = new BufferedReader(fr))
		{
			while(true)
			{
				String line = br.readLine();
				if(line == null)	
					break;
				Question q = Question.toQuestion(line);
				exam.add(q);
			}
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}