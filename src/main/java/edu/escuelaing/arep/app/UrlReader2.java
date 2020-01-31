package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlReader2 {
	public static void main( String[] args ) throws Exception
    {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String urlStr = br.readLine();	
		//String urlStr = "http://www.google.com/";
		System.out.println(urlStr);
        URL url = new URL(urlStr); 
        String ruta = "result.html";
        File file = new File(ruta);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);        
        br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = br.readLine();
        while (line != null) {
        	bw.write(line);
        	line = br.readLine();
        }
        bw.close();
        
        
    }
}
