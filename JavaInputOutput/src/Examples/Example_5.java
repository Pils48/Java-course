package Examples;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Example_5 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		try(InputStream is = new URL("https://www.google.ru/").openStream()){
			Reader reader = new InputStreamReader(is, "windows-1251");
			
			char[] buff = new char[16];
			int count;
			while((count = reader.read(buff)) != -1) {
				System.out.print(new String (buff, 0, count));
			}
			
		}
		
		

	}
	
}
