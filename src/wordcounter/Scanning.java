package wordcounter;

//public class Scanning {
	//package wordcounter;

	import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

	public class Scanning{

		/**
		 * @param args
		 */

		// CharSequence i;

		//String[] splittedwords = new String[100];
		ArrayList<String> wordsArray = new ArrayList<String>();
		int count = 0;
		int i = 0;
		String[] word = {};
		static String file;

		public void readFile(String FileName) {
			File file = new File("Sample.txt");
			try {
				Scanner sc = new Scanner(file);
				// System.out.println("My File:");
				// sc.useDelimiter("  *");
				while (sc.hasNextLine()) {
					String line = sc.nextLine();
					System.out.println(line);
					word = line.split("[\\W]");

				}
				sc.close();
				
				System.out.println(word.length);
				for (i = 0; i < word.length; i++) {

					 System.out.println("Splitted Word is:" + word[i]);
					wordsArray.add(word[i]);
					// System.out.println(wordsArray.size());

				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public void sortWord()
			{
				ArrayList<String> sortedWords = new ArrayList<String>();
				ArrayList<Integer> Number = new ArrayList<Integer>();
				String temp = null;
				int no = 0;
				
				for(int i =0; i <wordsArray.size(); i++)
				{
					temp = wordsArray.get(i);
					no = 0;		
					for(int j = 0; j < wordsArray.size(); j++)
						if(temp.equals(wordsArray.get(j)))
								// wordsArray.get(i))
						{
							no ++;
							wordsArray.remove(j);
						}
					
					Number.add(no);
					sortedWords.add(temp);
				}
			//	if (Number.size() == 0)
				//{
					//Number.add(no);
				//	sortedWords.add(temp);
					
				//}else
				//{
					//for(int j = 0; j < Number.size(); j++){
			          //  if(no > Number.get(j)){
			            //    Number.add(j, no);
			              //  sortedWords.add(j, temp);
				//}
			//	}
				
				for(i = 0; i < sortedWords.size(); i ++)
				{	
					//while(wordsArray.)
					if (sortedWords.get(i).length() ==  0)
					{
					  sortedWords.remove(i);
					  Number.remove(i);
						
					}
				}
		//System.out.println( "\n" +  sortedWords + ":" + "\n" + Number);
		for(int i = (Number.size()-1); i >0; i--)
		{
		     int temporary;
		     String s;

		    temporary = Number.get(i);
			for(int j= 1; j <=i; j ++)
			{
			if(Number.get(j-1)< Number.get(j))
			{
			   temporary =  Number.get(j-1);		
			   Number.set(j-1, Number.get(j));
			   Number.set(j, temporary);
			   
			   s =  sortedWords.get(j-1);		
			   sortedWords.set(j-1, sortedWords.get(j));
			   sortedWords.set(j, s);
			
			}
		}
		}
		for (int i =0; i < 5; i++)
		{
		//System.out.println(Number.);
		System.out.println(sortedWords.get(i) + ":" + Number.get(i));
		}	
		}

		//System.out.println("In Temporary: " + temporary);
			
		
			
		
		
			
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanning scannerObject = new Scanning();
			scannerObject.readFile(file);
			// scannerObject.split();
			scannerObject.sortWord();
		}

	}

