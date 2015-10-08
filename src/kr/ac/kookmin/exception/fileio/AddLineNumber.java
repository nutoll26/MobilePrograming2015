package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AddLineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = AddLineNumber.class.getResource("").getPath();
		
	    try
	    {
	    	BufferedReader inputStream = new BufferedReader(new FileReader(path+"original.txt"));
	        PrintWriter outputStream = new PrintWriter(new FileOutputStream(path+"numbered.txt"));
	        
	        String str = null;
	        int cnt = 1;
	        while(true){
	        	str = inputStream.readLine();
	        	if(str == null){
	        		break;
	        	}
	        	outputStream.println(cnt++ + ". " + str);
	        }
	       
	        inputStream.close( );
	        outputStream.close( );
	    }catch(FileNotFoundException e){
	    	e.printStackTrace();
	    }catch(IOException e){
	    	e.printStackTrace();
	    }
	}
}
