package crawler.crawle;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;


public class OneMoreTime {
	
	public void oneMore(List lista) throws URISyntaxException{
		GetInformation gI = new GetInformation();
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to find something one more time?: [Y/N]");
		String ans = input.next();
		if(ans.equals("Y")){
			while (!lista.isEmpty()) {
				lista.removeAll(lista);
		    }
			
			gI.getInfrmation();
		}
		if(ans.equals("N")){
			System.out.println("Bye, bye");
		}
	}
}
