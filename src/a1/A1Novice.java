package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

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

class Customer{
	String firstName = "Default";
	String lastName = "default";
	int numItems = 0;
	double total;

	Item item;
	List<Item> items = new ArrayList<Item>(numItems);


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	void addItem(Item item){
		items.add(item);
	}
}

class Item{
	String itemName;
	int num;
	double itemPrice;
	double itemTotal;

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setNum(int num) {
		this.num = num;
	}
}