
package resturant_ordering_system;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RestaurantOrderingSystemTest {
    
    
         @Test
         public void testAddItemToOrder() {
                  ItemMenu menuItem = new ItemFood("Burger", "Juicy homemade patties", 70, "French Fries");
                  ItemOrder itemOrder = new ItemOrder(menuItem, 2);

                  Order order = new Order();
                  order.addItem(itemOrder);

                  assertEquals(3, order.getItems().size());
    }

         @Test
         public void testCalculateItemSubtotal() {
                  ItemMenu menuItem = new ItemFood("Spaghetti", "Delicious pasta dish", 50, "Garlic Bread");
                  ItemOrder itemOrder = new ItemOrder(menuItem, 3);

                  assertEquals(150, itemOrder.calculateItemSubtotal());
    }

         @Test
         public void testCalculateTotalBill() {
                   ItemMenu menuItem1 = new ItemFood("Burger", "Juicy homemade patties", 70, "French Fries");
                   ItemMenu menuItem2 = new ItemDrink("Coke", "Classic cola", 20, "Medium");

                  Order order = new Order();
                  order.addItem(new ItemOrder(menuItem1, 2));
                  order.addItem(new ItemOrder(menuItem2, 3));

                  assertEquals(200, order.calculateTotalBill());
    }
    
}
