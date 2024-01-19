package assingment2_notedenomination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("enter the size of currency denominations");
			int size = scanner.nextInt();

			System.out.println("enter the currency denominations value");
			List<Integer> denominations = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int value = scanner.nextInt();
				denominations.add(value);
			}

			denominations.sort(Comparator.reverseOrder());

			System.out.println("enter the amount you want to pay");
			int amount = scanner.nextInt();

			Map<Integer, Integer> notes = new TreeMap<>(Comparator.reverseOrder());

			for (Integer denomination : denominations) {
				notes.put(denomination, amount / denomination);

				amount = amount % denomination;
			}

			System.out.println("Your payment approach in order to give the minimum number of notes will be:");
			for (Map.Entry<Integer, Integer> note : notes.entrySet()) {
				if (note.getValue() != 0) {
					System.out.println(note.getKey() + ":" + note.getValue());
				}

			}

		}

		catch (Exception exception) {
			System.out.println("Exception While Executing the program");
		}

	}

}
