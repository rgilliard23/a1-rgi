package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);


		int numCustomers;
		int value;
		String temp;
		Customer[] customers;
		Customer customer;
		System.out.println("How many customers are there?");
		numCustomers = scan.nextInt();
		customers = new Customer[numCustomers];

		for (int i =0; i < customers.length; i++){
			System.out.println("What is the customers first name?");
			temp = scan.next();
			customers[i] = new Customer();
			customers[i].setFirstName(temp);
			System.out.println("What is the customers last name?");
			temp = scan.next();
			customers[i].setLastName(temp);
			System.out.println("How many items does the customer have?");
			value = scan.nextInt();
			customers[i].setNumItems(value);


			for (int j = 0; j < customers[i].numItems; j++){
				System.out.println("How many items of this type are there");
				Item item = new Item();
				int num = scan.nextInt();
				System.out.println("What is the item name");
				item.itemName = scan.next();
				System.out.println("What is the item price");
				double itemPrice = scan.nextDouble();

				customers[j].total = itemPrice * num;
			}
		}
		for(int k = 0; k<customers.length; k++) {
			System.out.println(customers[k].firstName.charAt(0) + ". " + customers[k].lastName + ": " + customers[k].total);
		}


	}
}
