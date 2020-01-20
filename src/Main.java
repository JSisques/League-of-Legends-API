import java.util.ArrayList;
import java.util.Scanner;

import data.Campeon;
import data.ParseoJSON;
import data.PeticionWeb;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre de invocador");
		String invocador = scan.nextLine();
		
		ArrayList<Campeon> campeones = ParseoJSON.parsearCampeones(PeticionWeb.realizarPeticionCampeones(invocador));
	
		for (Campeon campeon : campeones) {
			System.out.println(campeon.toString());
		}
	
	}

	
}
