package ornekokul;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sozluk_MuhammetAliCorut_21010310014 {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("test.txt");
		Scanner in=new Scanner(file);
		
		ArrayList<String> list= new ArrayList<String>();
		
		list=getWords(in);
		System.out.println(list);
		
	}

	public static ArrayList<String> getWords(Scanner in){
		
		ArrayList<String> list= new ArrayList<String>();
		
		while(in.hasNext()) {
			String kelime=in.nextLine().toLowerCase();
			if(!list.contains(kelime))
			list.add(kelime);
			
			else
				System.out.println("tekrar eden kelime: "+kelime);
		}
		
		return list;
		
	}
	
	
}
