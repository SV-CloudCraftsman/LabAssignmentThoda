package capgemini.Labs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderExample {

	public static void main(String[] args) throws IOException {
		
		
		File myFile=new File("Abc.txt");
		
		//myFile.createNewFile();
		// TODO Auto-generated method stub
		
		FileWriter writer=new FileWriter(myFile);
		
		
		
		writer.write("Akash ");
		//writer.flush();
		writer.close();
		System.out.println("done");

	}

}
