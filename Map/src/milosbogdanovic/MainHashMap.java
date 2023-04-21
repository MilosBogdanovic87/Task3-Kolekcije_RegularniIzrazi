package milosbogdanovic;

import java.util.HashMap;

public class MainHashMap {

	public static void main(String[] args) {

		// Kreiranje HashMap objekta
		HashMap<String, Integer> operateri = new HashMap<>();

		// Dodavanje elemenata
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("1. Dodavanje elemenata: ugrađena metoda .put");
		System.out.println("--------------------------------------------------------------------------------------");
		operateri.put("Telekom Srbija", 789);
		operateri.put("Telenor", 213);
		operateri.put("VIP", 311);
		operateri.put("Globatel", 898);

		// Ispisivanje broja Telekom Srbija
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("2. Pristupanje vrednosti sačuvanom pod određenim ključem: ugrađena metoda .get");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Broj Telekom Srbija: " + operateri.get("Telekom Srbija"));

		// Provera da li tablica sadrži određeni ključ
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("3. Provera da li tablica sadrži određeni ključ: ugrađena metoda .containsKey");
		System.out.println("--------------------------------------------------------------------------------------");
		boolean sadrziKljuc = operateri.containsKey(789);
		if (sadrziKljuc) {
			System.out.println("Tablica sadrži ključ");
		} else
			System.out.println("Tablica ne sadrži ključ");

		// Provera da li tablica sadrži određenu vrednost
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("4. Provera da li tablica sadrži određenu vrednost: ugrađena metoda .containsValue");
		System.out.println("--------------------------------------------------------------------------------------");
		boolean sadrziVrednost = operateri.containsValue("Telekom Srbija");
		if (sadrziVrednost) {
			System.out.println("Tablica sadrži vrednost");
		} else {
			System.out.println("Tablica ne sadrži zadatu vrednost");
		}

		// Uklanjanje elementa iz tablice
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("5. Uklanjanje elementa iz tablice: ugrađena metoda .remove");
		System.out.println("--------------------------------------------------------------------------------------");
		operateri.remove("Telekom Srbija");

		// Ispisivanje svih ključeva i vrednosti u HashMap
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("6. Ispisivanje svih ključeva i vrednosti u HashMap");
		System.out.println("--------------------------------------------------------------------------------------");
		for (String s : operateri.keySet()) {
			System.out.println(s + ": " + operateri.get(s));
		}
	}
}
