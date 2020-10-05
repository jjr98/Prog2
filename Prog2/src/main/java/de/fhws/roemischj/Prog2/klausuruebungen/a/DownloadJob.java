package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.net.URL;
import java.util.UUID;

public class DownloadJob implements Runnable{
	private URL url;
	private final String JobId;
	private byte[] data; 

	public byte[] getData() {
		return data;
	}
	
	public String getJobID() {
		return JobId;
	}
	
	public DownloadJob(URL url) {
		this.url = url;
		this.JobId = UUID.randomUUID().toString();
	} 
	
	@Override
	public void run() {
		data = DownloadManager.downloadFromURL(url);
	}
}
