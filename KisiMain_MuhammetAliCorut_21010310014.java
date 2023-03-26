package ornekokul;

import java.util.ArrayList;

public class KisiMain_MuhammetAliCorut_21010310014 {

	public static void main(String[] args) {
		
		ArrayList<Kisi> bireyler= new ArrayList<Kisi>();
			
		Kisi temp= new Kisi("Muhammet",20);
		bireyler.add(temp);
		
		bireyler.add(new Kisi("mehmet",40));
		bireyler.add(new Kisi("hayri",40));
		
		for(Kisi kisi:bireyler) {
			System.out.println(kisi);
			System.out.println("isim: "+kisi.getIsim()+","+"yas: "+kisi.getYas());
			

		}
	}
	
	
	
	
	
}
