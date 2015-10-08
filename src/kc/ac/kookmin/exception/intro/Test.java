package kc.ac.kookmin.exception.intro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AAA{
	
	FileInputStream IFile;
	String path = AAA.class.getResource("").getPath();
	
	public void readFile(){
		byte buf[] = new byte[64]; 
		
		try{
			IFile = new FileInputStream(path + "inputTest");
			IFile.read(buf);
		}catch(FileNotFoundException e){
			e.printStackTrace();	
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(int i=0; i<buf.length; i++){
			if(buf[i] == 0){
				break;
			}
			System.out.print(buf[i] + " ");
		}
	}
	
	public void clsoeFile(){
		try{
			IFile.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AAA tr = new AAA();
		tr.readFile();
		tr.clsoeFile();
	}

}
