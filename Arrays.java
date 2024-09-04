package arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] inventory = new String[5];
        inventory[0] = "Greatsword";
        inventory[1] = "Red Potion";
        inventory[2] = "Fishing Rod";
        inventory[3] = "Fairy Bow";
        inventory[4] = "Arrows";

        for (int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i]);
        }
    }


}
