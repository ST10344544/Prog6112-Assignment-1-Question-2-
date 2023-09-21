
package resturant_ordering_system;

import java.util.List;
import java.util.ArrayList;

public class Order {
         private static List<ItemOrder> items = new ArrayList<>();

         public void addItem(ItemOrder itemOrder) {
                  items.add(itemOrder);
         }

         public  List<ItemOrder> getItems() {
                  return  items;
         }

         public double calculateTotalBill() {
                  double total = 0.0;
                  for (ItemOrder itemOrder : items) {
                           total += itemOrder.calculateItemSubtotal();
         }
         return total;
    }

}

