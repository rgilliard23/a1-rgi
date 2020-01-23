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
        ///System.out.println("How many customers are there?");
        numCustomers = scan.nextInt();
        customers = new Customer[numCustomers];

        for (int i = 0; i < customers.length; i++) {
           // System.out.println("What is the customers first name?");
            temp = scan.next();
            customers[i] = new Customer();
            customers[i].setFirstName(temp);
           // System.out.println("What is the customers last name?");
            temp = scan.next();
            customers[i].setLastName(temp);
            //System.out.println("How many items does the customer have?");
            value = scan.nextInt();
            customers[i].setNumItems(value);

            Item[] items = new Item[customers.length];
            for (int c = 0; c < value; c++) {
                Item item = new Item();

                //System.out.println("How many items of this type are there");
                int num = scan.nextInt();

                //System.out.println("What is the item name");
                item.itemName = scan.next();

                item.num = num;
                //System.out.println("What is the item price");
                double itemPrice = scan.nextDouble();
                item.itemPrice = itemPrice;
                customers[i].items.add(item);
                item.itemTotal = itemPrice * num;
                customers[i].total += itemPrice * num;
            }
        }



        int num;
        int num2;

        List<String> itemNames = new ArrayList<>();

            List<Item> items = new ArrayList<Item>();
            //getting all the items from each customer and adding to list
            for (int d = 0; d < customers.length; d++) {
                for (int e =0; e < customers[d].items.size(); e++ )
                items.add(customers[d].items.get(e));
            }



            Item[] items2 = items.toArray(new Item[items.size()]);



        for (int y = 0; y < items2.length; y++){
            String itemName = items2[y].itemName;
            if (!itemNames.contains(itemName)) {
                itemNames.add(itemName);
            }

        }

        String[][] itemNameCount = new String[itemNames.size()][3];

            //adding each unique item
            for (int e = 0; e < itemNames.size(); e++) {
                num = 0;
                //checking how many of the same products were ordered
                for (int f = 0; f < items2.length; f++) {
                    String itemName = items2[f].itemName;
                    if (itemName == items2[f].itemName) {
                        num += items2[f].num;
                    }
                }
                itemNameCount[e][0] = itemNames.get(e);
                itemNameCount[e][1] = Integer.toString(num);
            }
                //checking how many customers have ordered the same products
                for (int g = 0; g < itemNames.size(); g++) {
                    num2 = 0;
                    for (int h = 0; h < items2.length; h++) {
                        if(itemNames.contains(items2[h].itemName)){
                            num2++;
                            itemNameCount[g][2] = Integer.toString(num2);
                        }
                        //if (itemNames.get(g) == items2[h].itemName) {
                       // }
                    }
                }

        for (int z = 0; z < itemNames.size(); z++){
            if (itemNameCount[z][1] == "0"){
                System.out.println("No customers bought " + itemNameCount[z][0]);
            }
            else {
                System.out.println(itemNameCount[z][2] + " customers bought " + itemNameCount[z][1] + " " + itemNameCount[z][0]);
            }
        }
    }
}
