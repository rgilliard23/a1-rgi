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
			//System.out.println("What is the customers first name?");
			temp = scan.next();
			customers[i] = new Customer();
			customers[i].setFirstName(temp);
			//System.out.println("What is the customers last name?");
			temp = scan.next();
			customers[i].setLastName(temp);
			//System.out.println("How many items does the customer have?");
			value = scan.nextInt();
			customers[i].setNumItems(value);


            for (int c = 0; c < value; c++) {
                Item item = new Item();

				// System.out.println("How many items of this type are there");
				int num = scan.nextInt();

                //System.out.println("What is the item name");
                item.itemName = scan.next();

               // System.out.println("What is the item price");
                double itemPrice = scan.nextDouble();
                customers[i].items.add(item);
                customers[i].total += itemPrice * num;
            }
		}


		int num = 0;
		int num2 = 0;
		for(int k = 0; k <customers.length; k++) {

		    double smallest = customers[0].total;
		    if(customers[k].total > num){
		        num = k;
            }
		    else if (customers[k].total < smallest){
		        num2 = k;
            }

		}


        System.out.println("Biggest: " + customers[num].getName() + " " + customers[num].total);
        System.out.println("Smallest: " + customers[num2].getName() + " " + customers[num2].total);
        System.out.println("Average: " + "(" + (customers[num].total + customers[num2].total) / 2 + ")");

	}
}
