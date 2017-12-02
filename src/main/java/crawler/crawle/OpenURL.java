package crawler.crawle;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

public class OpenURL {

	public void makeDecision(List lista) throws IOException, URISyntaxException{
		Scanner input = new Scanner(System.in);
		CheckSize size = new CheckSize();
		OneMoreTime onemoretime = new OneMoreTime();
		int listSize = size.checkSize(lista);
		Desktop d = Desktop.getDesktop();
		String dec;
		boolean check = true;
		if(listSize>1){
			while(check){
			System.out.println("Which one would you like to open? Just say a number: ");
			int index = input.nextInt();
			index -=1;
			switch(index){
				case 0:
					String url = (String) lista.get(0);	
					d.browse(new URI(url));
				break;
				
				case 1:
					String url1 = (String) lista.get(1);	
					d.browse(new URI(url1));
					break;
					
				case 2:
					String url2 = (String) lista.get(2);	
					d.browse(new URI(url2));
					break;
					
				case 3:
					String url3 = (String) lista.get(3);	
					d.browse(new URI(url3));
					break;
				
				case 4:
					String url4 = (String) lista.get(4);	
					d.browse(new URI(url4));
					break;
			}
			System.out.println("Would you like to open something else? [Y/N]");
			String ans = input.next();
			if(ans.equals("N"))
				check=!check;
				}
			
		}
		
		if(listSize<2){
			System.out.println("Would you like to open this page? [Y/N]");
			String ans = input.next();
			if(ans.equals("Y")){
				String url5 =(String) lista.get(0);
				d.browse(new URI(url5));
			}
		}
		
		onemoretime.oneMore(lista);
	}
}
