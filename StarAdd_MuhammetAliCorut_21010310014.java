package ornekokul;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class StarAdd_MuhammetAliCorut_21010310014 {

	public static void main(String[] args) {


		ArrayList<String> words= new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("kitap");
		System.out.println("dongü öncesi: "+words);
		System.out.println("liste uzunluğu: "+words.size());
		
		for (int i = 0; i < words.size(); i+=2) {
			
			words.add(i,"*");
			
		}
		System.out.println("döngü sonrası: "+words);
		System.out.println("liste uzunluğu: "+words.size());

		for(int i=0;i<words.size();i++) {
			words.remove(i);
		}
		System.out.println("silme sonrası: "+words);
		System.out.println("liste uzunluğu: "+words.size());

		Collections.sort(words);
		System.out.println(words);
	}

}
