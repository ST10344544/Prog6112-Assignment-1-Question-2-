
package resturant_ordering_system;



public class ItemMenu {
         private String itemName;
         private String itemDescription;
         private double itemPrice;

         public ItemMenu(String itemName, String itemDescription, double itemPrice) {
                  this.itemName = itemName;
                  this.itemDescription = itemDescription;
                  this.itemPrice = itemPrice;
         }

         public void displayItemDetails() {
                  System.out.println("Item: " + itemName);
                  System.out.println("Description: " + itemDescription);
                  System.out.println("Price: R" + itemPrice);
         }

         public double getPrice() {
                  return itemPrice;
         }

         public String getItemName() {
                  return itemName;
         }

    

   
}

