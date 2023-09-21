
package resturant_ordering_system;



public class ItemDrink extends ItemMenu {
         private String size;

         public ItemDrink(String itemName, String itemDescription, double itemPrice, String size) {
                  super(itemName, itemDescription, itemPrice);
                  this.size = size;
    }

        @Override
         public void displayItemDetails() {
                  super.displayItemDetails();
                  System.out.println("Size: " + size);
    }

}
