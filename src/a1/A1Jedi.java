package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Jedi {

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

        for (int i = 0; i < customers.length; i++) {
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

            Item[] items = new Item[customers.length];
            for (int c = 0; c < value; c++) {
                Item item = new Item();
                System.out.println("What is the item name");
                item.itemName = scan.next();
                System.out.println("How many items of this type are there");
                int num = scan.nextInt();
                System.out.println("What is the item price");
                double itemPrice = scan.nextDouble();
                customers[i].items.add(item);
                customers[i].total += itemPrice * num;
            }
        }

        String[][] itemNameCount = new String[0][0];

        int num = 0;

        for (int k = 0; k < customers.length; k++) {
            List<Item> items = new ArrayList<Item>();


            for (int d = 0; d < customers.length; d++) {
                items.add(customers[d].item);
            }

            Item[] items2 = (Item[]) items.toArray();


            for (int e = 0; e < items.size(); e++) {
                String itemName = items2[e].itemName;


                num = 0;
                for (int f = 0; f < items2.length; f++) {


                    if (itemName == items2[f].itemName) {
                        num++;
                    }

                }
                itemNameCount = new String[items2.length][2];
                itemNameCount[e][0] = itemName;
                itemNameCount[e][1] = Integer.toString(num);
            }

        }

        for (int g = 0; g < itemNameCount.length; g++)
            System.out.println(itemNameCount[g][0] + "");


    }
}
