package de.fhws.roemischj.Prog2.klausuruebungen.a;

import java.net.MalformedURLException;
import java.net.URL;

public class DownloadManager {
	private URL url ;

	DownloadManager configure ( int maxThreads , long timeout ) {
		return null;
	}
	
	String startDownload (){
		DownloadJob dj = new DownloadJob(url);
		Thread t1 = new Thread(dj);
		t1.start();
		return dj.getJobID();
	} // returns the JobId
	
	void cancelDownload ( String jobId ){
		
	}
	
	DownloadManager specifyDownloadLocation ( URL url) {
		DownloadManager dm = new DownloadManager();
		dm.url = url ;
		return dm;
	}

	// nicht Teil des FluidInterfaces
	public static byte[] downloadFromURL(URL url ) {
		return null;  
	}
	
	
	public static void main(String[] args) throws MalformedURLException {
		DownloadManager dm = new DownloadManager()
				.configure(4, 4000)
				.specifyDownloadLocation(new URL("http :// example . com / resource"));
		System.out.println(dm.startDownload());
	}
}

// e) 	Mehrere URLs und JobIDs (sowie Threads zum Abbrechen) müssen gespeichert werden können
// 		Eine passende Datenstruktur wäre z.B. eine Map, da JobIDs eindeutig sind und so den URLS zugeordnet werden können.