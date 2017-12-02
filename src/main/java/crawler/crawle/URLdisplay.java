package crawler.crawle;

import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.net.URISyntaxException;

public class URLdisplay {
	
	public void urlDisplay(List lista, int size) throws IOException, URISyntaxException{ 
		int i = 1;
		GetInformation gI = new GetInformation();
		System.out.println();
		if(size>1){
			System.out.println("I have found a few interesting examples. Please, have a look: ");
			System.out.println("--------------------------------");
		}
		if(size<2&&size!=0){
			System.out.println("I have found some interesting example. Please, have a look: ");
			System.out.println("--------------------------------");
		}
		if(size==0){
			System.out.println("I couldn't find anything.... Try again");
			gI.getInfrmation();
		}
		for(final Object site: lista){
			if(i<6){
				System.out.println(i+". "+site);
				System.out.println("--------------------------------");
				i++;
			}
		}
		
		
	}
}
