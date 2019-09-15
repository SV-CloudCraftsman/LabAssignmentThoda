package capgemini.Labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab8Program3 {
	
	
	static void countWords(FileReader f1) throws IOException
	{
		BufferedReader br=new BufferedReader(f1);
		int i=0;
		String result=br.readLine();
		while(result!=null)
		{
			String[] wordList = result.split("\\s+"); 
			System.out.println("wordlist="+wordList);
			result=br.readLine();
		}
		System.out.println("number of lines present in file is :"+i);
		
	}
//		String line = null;
		
//        
//        int countWord = wordList.length;
//	}

		
		static void NoOfCharacters(FileReader f1) throws IOException
		{
			int i=f1.read();
			System.out.println("number of characters="+i);
		}
		
		static void NoOfLines(FileReader f2) throws IOException
		{
			BufferedReader br=new BufferedReader(f2);
			int i=0;
			String result=br.readLine();
			while(result!=null)
			{
				++i;
				result=br.readLine();
			}
			System.out.println("number of lines present in file is :"+i);
		}
		
		public static void main(String[] args) throws IOException {
			FileReader f1=new FileReader("abc.txt");
			NoOfCharacters(f1);
			NoOfLines(f1);
			countWords(f1);
			
		}

	}
