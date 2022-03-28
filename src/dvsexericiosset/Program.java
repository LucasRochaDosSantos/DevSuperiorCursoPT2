package dvsexericiosset;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import dvsexericiosset.entities.LogEntry;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       String path = "C:\\Users\\Lucas Rocha\\Documents\\log.txt";
       Set<LogEntry> linhas = new HashSet<>();
       try(BufferedReader br = new BufferedReader(new FileReader(path)))
       {
           String linha = br.readLine();      	   
    	   while(linha != null){
    		   String[] fields = linha.split(" ");
    		   Date moment = Date.from(Instant.parse(fields[1]));
    		   linhas.add(new LogEntry(fields[0], moment));
    		   linha = br.readLine();
    	   }
    	   System.out.println("Total Users: " + linhas.size());
       }catch(IOException e) {
    	   e.printStackTrace();
       }
	}
}
