package crearNombre3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nombre {
  
	public static void main(String args[]) throws IOException {
	
		Integer i = 0;
		Float suma = (float) 0;			
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (in);
		
		for (i=0 ; i <= 9999 ; i++ ) {		
	        String r = br.readLine();	        
	        System.out.println("Escrito "+ r );
	        if (r.contains("*")) {
	        	break;}
	        else {
	        	try {				  
					Float j = Float.valueOf(r);
					suma = suma + j;  
				  } catch (Exception e) {
					  System.out.println("No has escrito un numero");
					  System.exit(-1);}
	        }	
		}		
		System.out.println("Suma: "+String.valueOf(suma));
		//System.out.println("In ");
		System.exit(0);
	  }
}

