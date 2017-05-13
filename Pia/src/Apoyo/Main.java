package Apoyo;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		String givenString = "Ustedes lo aman a pesar de no haberlo visto; y aunque no lo ven ahora, creen en Arbol y se alegran con un gozo indescriptible y glorioso, pues estan obteniendo la meta de su fe, que es su salvacion.";

		/*
		 * Construct frequency based on repetition in given string
		 */
		ShannonFano sfc = new ShannonFano(givenString);
		System.out.println(sfc);

		HuffmanCode hfc = new HuffmanCode(givenString);
		System.out.println(hfc);

		/*
		 * Construct frequency based on Length of original string by given
		 * probability
		 */

		HashMap<Character, Double> probability = new HashMap<Character, Double>();

		probability.put(' ', 0.0000);
		probability.put('a', 0.0000);
		probability.put('b', 0.0000);
		probability.put('c', 0.0000);
		probability.put('d', 0.0000);
		probability.put('e', 0.0000);
		probability.put('f', 0.0000);
		probability.put('g', 0.0000);
		probability.put('h', 0.0000);
		probability.put('i', 0.0000);
		probability.put('j', 0.0000);
		probability.put('k', 0.0000);
		probability.put('l', 0.0000);
		probability.put('m', 0.0000);
		probability.put('n', 0.0000);
		probability.put('ñ', 0.0000);
		probability.put('o', 0.0000);
		probability.put('p', 0.0000);
		probability.put('q', 0.0000);
		probability.put('r', 0.0000);
		probability.put('s', 0.0000);
		probability.put('t', 0.0000);
		probability.put('u', 0.0000);
		probability.put('v', 0.0000);
		probability.put('w', 0.0000);
		probability.put('x', 0.0000);
		probability.put('y', 0.0000);
		probability.put('z', 0.0000); 

		ShannonFano sfcx = new ShannonFano(givenString, probability);
		System.out.println(sfcx);

		HuffmanCode hfcx = new HuffmanCode(givenString, probability);
		System.out.println(hfcx);

	}

}
