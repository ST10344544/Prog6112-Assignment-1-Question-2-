
package resturant_ordering_system;

public class ItemOrder {
         private ItemMenu item;
         private int quantity;

         public ItemOrder(ItemMenu item, int quantity) {
                  this.item = item;
                  this.quantity = quantity;
         }

         public ItemMenu getItem() {
                  return item;
         }

         public int getQuantity() {
                  return quantity;
         }

         public double calculateItemSubtotal() {
                  return item.getPrice() * quantity;
         }

}

