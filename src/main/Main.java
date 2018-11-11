package main;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Main {

	public static void main(String[] args) throws IOException {
	
		final Document doc = Jsoup.connect("https://meteo.gov.ua/ua/33345/satellite").get();
		
		for (Element row: doc.select("img")) {
		
			
			System.out.println(row);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	/*	Document doc;
		doc = Jsoup.connect("https://meteo.ua/ua/sputnik").get();
			Elements images = doc.getElementsByTag("img");
			for(Element image : images) {
				
				String i = image.attr("src");
				if(i.length()>0) {
					if(i.length()<4) {
						i = doc.baseUri()+i.substring(1);}
						else if(!i.substring(0, 4).equals("http"))
							i = doc.baseUri()+ i.substring(1);
					}
					System.out.println(i);
				
				}*/
				
	}}
