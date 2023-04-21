package milosbogdanovic;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegularExpressions {
	public static void main(String[] args) {

		ArrayList<String> artikli = new ArrayList<>();

		// Kreiramo listu artikala sa cenama
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1. Dodajemo artikle u listu: ");
		System.out.println("------------------------------------------------------------------------");
		artikli.add("Patike, cena: 6000 din");
		artikli.add("Ranac, cena: 4500 din");
		artikli.add("Majica, cena: 3000 din");
		artikli.add("Farmerke, cena: 8000 din");
		artikli.add("Jakna, cena: 10000 din");

		// Štampamo listu
		System.out.println("------------------------------------------------------------------------");
		System.out.println("2. Štampamo listu");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Svi artikli sa cenama: ");
		for (String s : artikli) {
			System.out.println(s);
		}

		// Kreiramo regularni izraz za cenu od 3000 dinara
		System.out.println("------------------------------------------------------------------------");
		System.out.println("3. Kreiramo ragularni izraz za pretragu");
		System.out.println("------------------------------------------------------------------------");
		String regCena = "\\b3000\\b";

		// Pretražujemo sve artikle po regex-u
		System.out.println("------------------------------------------------------------------------");
		System.out.println("4. Pretraga artikla po kreiranom šablonu i ukoliko postoji štampamo");
		System.out.println("------------------------------------------------------------------------");
		for (String artikal : artikli) {
			Pattern pattern = Pattern.compile(regCena);
			Matcher pretragaCene = pattern.matcher(artikal);

			// Ako nađemo odgovarajući artikal ispisujemo ga
			if (pretragaCene.find()) {
				System.out.println(artikal);
			}
		}
	}
}
