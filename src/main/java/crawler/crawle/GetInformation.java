package crawler.crawle;

import java.net.URISyntaxException;
import java.util.Scanner;

public class GetInformation {
	
	public void getInfrmation() throws URISyntaxException{
		SoFBotSearch search = new SoFBotSearch();
		//CheckSize listaSize = new CheckSize();
		Scanner input = new Scanner(System.in);
		System.out.println("What is your problem?");
		String problem = input.nextLine();
		System.out.println("Searching...");
		search.SoFBot(problem);
		System.out.println();
	}
}
