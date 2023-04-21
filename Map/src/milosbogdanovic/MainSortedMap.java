package milosbogdanovic;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MainSortedMap {
	public static void main(String[] args) {

		SortedMap<Integer, String> sifraArtikla = new TreeMap<Integer, String>();

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("1. Dodavanje elemenata: ugrađena metoda .put");
		System.out.println("--------------------------------------------------------------------------------------");
		sifraArtikla.put(1001, "Jabuka");
		sifraArtikla.put(1002, "Kruška");
		sifraArtikla.put(1003, "Banana");
		sifraArtikla.put(1004, "Narandža");

		// Ispis svih stavki na kasi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("2. Ispis svih stavki na kasi: ");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Artikli na kasi: ");
		for (Map.Entry<Integer, String> entry : sifraArtikla.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Prikaz prvog artikla na kasi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("3. Ispisivanje prvog artikla na kasi: ugrađena metoda .firstKey");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println(
				"Prvi artikal na kasi: " + sifraArtikla.firstKey() + " - " + sifraArtikla.get(sifraArtikla.firstKey()));

		// Prikaz poslednjeg artikla na kasi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("4. Ispisivanje poslednjeg artikla na kasi: ugrađena metoda .lastKey");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Poslednji artikal na kasi: " + sifraArtikla.lastKey() + " - "
				+ sifraArtikla.get(sifraArtikla.lastKey()));

		// Prikaz svih artikala sa šifrom manjom od 1003
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("5. Prikaz svih artikala sa šifrom manjom od 1003: ugrađena metoda .headMap");
		System.out.println("----------------------------------------------------------------------------------------");
		SortedMap<Integer, String> subMap = sifraArtikla.headMap(1003);
		System.out.println("Artikli sa šifrom manjom od 1003: ");
		for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Prolaz kroz mapu iteratorom
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("6. Iteriranje kroz mapu");
		System.out.println("----------------------------------------------------------------------------------------");
		Set<Integer> kljucevi = sifraArtikla.keySet();
		Iterator<Integer> iterator = kljucevi.iterator();
		while (iterator.hasNext()) {
			Integer kljuc = iterator.next();
			String vrednost = sifraArtikla.get(kljuc);
			System.out.println("Šifra: " + kljuc + ", Artikal: " + vrednost);
		}

	}
}
