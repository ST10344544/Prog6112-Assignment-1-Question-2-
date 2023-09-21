
package resturant_ordering_system;



public class ItemFood extends ItemMenu {
         private String sides;

         public ItemFood(String itemName, String itemDescription, double itemPrice, String sides) {
                  super(itemName, itemDescription, itemPrice);
                  this.sides = sides;
         }

         @Override
         public void displayItemDetails() {
                  super.displayItemDetails();
                  System.out.println("Sides: " + sides);
         }

}
