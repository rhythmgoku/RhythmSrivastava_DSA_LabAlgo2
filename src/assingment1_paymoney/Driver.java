package assingment1_paymoney;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("enter the size of transaction array");
			int size = scanner.nextInt();

			List<Integer> transactions = new ArrayList<>();

			System.out.println("enter the values of array");			
			
			for (int i = 0; i < size; i++) {
				int value = scanner.nextInt();
				transactions.add(value);
			}

			System.out.println("enter the total no of targets that needs to be achieved ");

			int targets = scanner.nextInt();

			for (int t = 0; t < targets; t++) {

				System.out.println();
				System.out.println("enter the value of target");

				int transactionsRequired = 0;
				int transactionSum = 0;
				int target = scanner.nextInt();

				for (int i = 0; i < size; i++) {
					transactionSum = transactionSum + transactions.get(i);
					transactionsRequired++;

					if (transactionSum >= target) {

						System.out.println("Target achieved after " + transactionsRequired + " transactions");
						break;
					}
				}

				if (transactionSum < target) {
					System.out.println("Given target is not achieved");
				}
			}
		}

		catch (Exception exception) {
			System.out.println("Exception While Executing the program");
		}

	}

}
