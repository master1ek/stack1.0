package crawler.crawle;

import java.util.regex.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SoFBotSearch {
	
	private static final String USER_AGENT ="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
	private static List<String> sites = new LinkedList<String>();
	
	public void SoFBot(String problem) throws URISyntaxException{
		URLdisplay display = new URLdisplay();
		CheckSize lSize = new CheckSize();
		OpenURL openURL = new OpenURL();
		try{
			
		Connection connection = Jsoup.connect("https://stackoverflow.com/search?q="+problem).userAgent(USER_AGENT);
		Document document = connection.get();
		Pattern pattern = Pattern.compile(".*https://stackoverflow.com/questions/tagged/.*");
		for(Element row: document.select("div.search-results.js-search-results")){
    		Elements URLs = row.select("a[href*=\"/questions/\"]");
    		for(Element link: URLs){
    			sites.add(link.absUrl("href"));
    		}
    	}
		
    	Iterator<String> l = sites.iterator();
    	while(l.hasNext()){
    		String x = l.next();
    		Matcher matcher = pattern.matcher(x);
    		if(matcher.matches()){
    			l.remove();
    		} 
    	}
    	
    		int s = lSize.checkSize(sites);
    		display.urlDisplay(sites,s);
    		openURL.makeDecision(sites);
    		
        
		}catch(IOException ioe){
            System.out.println("Something went wrong...");
        }
	}

}
