package milosbogdanovic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {

	public static void main(String[] args) {
		LinkedList<String> spisakGradova = new LinkedList<String>();

		// Dodavanje u listu
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("1. Dodavanje u listu: ugrađena metoda .add");
		System.out.println("----------------------------------------------------------------------------------------");
		spisakGradova.add("Beograd");
		spisakGradova.add("Niš");
		spisakGradova.add("Novi Sad");

		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("2. Dodavanje u listu na određenu poziciju: ugrađena metoda .add(index, element)");
		System.out.println("----------------------------------------------------------------------------------------");
		spisakGradova.add(3, "Bor");

		// Prolazak kroz listu unapređenom for petljom
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("3. Prolazak kroz listu unapređenom for petljom: ");
		System.out.println("----------------------------------------------------------------------------------------");
		for (String s : spisakGradova) {
			System.out.println(s);
		}

		// Vraćanje elementa sa zadate pozicije
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("4. Vraća element sa zadate pozicije: ugrađena metoda .get ");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println(spisakGradova.get(2));

		// Vraća prvi element u listi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("5. Vraća prvi element u listi: ugrađena metoda .getFirst()");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Prvi grad u listi: " + spisakGradova.getFirst());

		// Vraća poslednji element u listi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("6. Vraća poslednji element u listi: ugrađena metoda .getLast()");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Poslednji grad u listi: " + spisakGradova.getLast());

		// Provera da li je lista prazna ili nije
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("7. Provera da li je lista prazna: ugrađena metoda .isEmpty");
		System.out.println("----------------------------------------------------------------------------------------");
		if (spisakGradova.isEmpty()) {
			System.out.println("Lista gradova je prazna.");
		} else {
			System.out.println("Lista gradova nije prazna.");
		}

		// Metoda za prebacivanje liste u niz
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("8. Prebacivanje liste u niz: ugrađena metoda .toArray");
		System.out.println("----------------------------------------------------------------------------------------");
		String[] nizGradova = new String[spisakGradova.size()];
		spisakGradova.toArray(nizGradova);

		for (String s : nizGradova) {
			System.out.println(s);
		}

		// Proverava da li lista sadrži dati element
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("9. Provera da li lista sadrži dati element: ugrađena metoda .contains");
		System.out.println("----------------------------------------------------------------------------------------");
		boolean sadrzi = spisakGradova.contains("Bor");
		if (sadrzi) {
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji");
		} else {
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji");
		}

		// Vraća indeks prvog pojavljivanja datog elementa u listi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("10. Vraća indeks prvog pojavljivanja datog elementa u listi: ugrađena metoda .indexOf");
		System.out.println("----------------------------------------------------------------------------------------");
		int index = spisakGradova.indexOf("Bor");
		System.out.println("Indeks elementa \"Grad Bor\" je: " + index);

		// Ispisivanje broja elemenata u listi
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("11. Vraća broj elemenata u listi: ugrađena metoda .size");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Broj elemenata u listi: " + spisakGradova.size());

		// Uklanjanje elementa sa datom pozicijom iz liste
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("12. Uklanjanje elementa sa datom pozicijom: ugrađena metoda .remove");
		System.out.println("----------------------------------------------------------------------------------------");
		spisakGradova.remove(2);
		for (String s : spisakGradova) {
			System.out.println(s);
		}

		// Iteriranje kroz elemente liste pomoću Iterator objekta
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("13. Iteriranje kroz elemente liste pomoću Iterator objekta: interfejs Iterator");
		System.out.println("----------------------------------------------------------------------------------------");
		Iterator<String> iterator = spisakGradova.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Iteriranje kroz elemente liste pomoću ListIterator objekta
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("14. Iteriranje kroz elemente liste pomoću ListIterator objekta: interfejs ListIterator");
		System.out.println("----------------------------------------------------------------------------------------");
		ListIterator<String> listIterator = spisakGradova.listIterator(3);
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

		// Brisanje svih elemenata iz liste
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("15. Brisanje svih elemenata iz liste: ugrađena metoda .clear");
		System.out.println("----------------------------------------------------------------------------------------");
		spisakGradova.clear();
		if (spisakGradova.isEmpty()) {
			System.out.println("Lista gradova je prazna.");
		} else {
			System.out.println("Lista gradova nije prazna.");
		}

	}

}
