
package resturant_ordering_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant_Ordering_System {

         public static void main(String[] args) {
                  Scanner scanner = new Scanner(System.in);
                  List<ItemMenu> menu = new ArrayList<>();
                  Order order = new Order(); 
         
                  //menu food items
                  menu.add(new ItemFood("Burger", "Juicy homemade patties", 70, "French Fries"));
                  menu.add(new ItemFood("Spaghetti", "Delicious pasta dish", 50, "Garlic Bread"));
                  menu.add(new ItemFood("Pizza", "Margherita pizza with fresh mozzarella", 65, "Pizza Pops"));
                  menu.add(new ItemFood("Salad", "Garden salad with mixed greens", 32, "None"));
                  //menu drinks
                  menu.add(new ItemDrink("Water", "Refreshing beverage", 12, "Large"));
                  menu.add(new ItemDrink("Coke", "Classic cola", 20, "Medium"));
                  menu.add(new ItemDrink("Iced Tea", "Refreshing iced tea", 30, "Large"));
                  menu.add(new ItemDrink("Coffee", "Hot brewed coffee", 25, "Regular"));

                  while (true) {
                           System.out.println("\nMenu:");
                           int itemNumber = 1;
                           for (ItemMenu menuItem : menu) {
                           System.out.println(itemNumber + ". " + menuItem.getItemName());
                                    itemNumber++;
                  }
                  System.out.println("0. Finish Order");

                  System.out.print("Select an item (0 to finish): ");
                  int choice = scanner.nextInt();

                  if (choice == 0) {
                  break;
                  } else if (choice > 0 && choice <= menu.size()) {
                           System.out.print("Enter quantity: ");
                           int quantity = scanner.nextInt();
                           ItemMenu selectedItem = menu.get(choice - 1);
                           ItemOrder itemOrder = new ItemOrder(selectedItem, quantity);
                           order.addItem(itemOrder);
                  } else {
                           System.out.println("Invalid choice. Please try again.");
                  }
         }

         System.out.println("\nOrder Details:");
         for (ItemOrder itemOrder : order.getItems()) {
                  ItemMenu item = itemOrder.getItem();
                  item.displayItemDetails();
                  System.out.println("Quantity: " + itemOrder.getQuantity());
                  System.out.println("Subtotal: R" + itemOrder.calculateItemSubtotal() + "\n");
         }

         System.out.println("\nTotal Bill: R" + order.calculateTotalBill());

         scanner.close();
    }
}

    

