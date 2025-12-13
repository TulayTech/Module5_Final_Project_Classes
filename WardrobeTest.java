/**
 **Simple test class for Wardrobe and ClothingItem subclasses.
 */
public class WardrobeTest {

    public static void main(String[] args) {
        // Create a new wardrobe
        Wardrobe wardrobe = new Wardrobe();

        // Create some sample clothing items
        TopItem t1 = new TopItem(
                "White Dress Shirt",
                "Dress Shirt",
                "Slim fit, long sleeve",
                "White",
                "TOP-WHT-DRS"
        );

        TopItem t2 = new TopItem(
                "Black T-Shirt",
                "T-Shirt",
                "Casual crew neck",
                "Black",
                "TOP-BLK-TSH"
        );

        BottomItem b1 = new BottomItem(
                "Navy Dress Pants",
                "Dress Pants",
                "Slim fit stretch fabric",
                "Navy",
                "BOT-NVY-DRS"
        );

        OuterwearItem o1 = new OuterwearItem(
                "Gray Blazer",
                "Blazer",
                "Business blazer, structured shoulders",
                "Gray",
                "OUT-GRY-BLZ"
        );

        // Add items to the wardrobe
        wardrobe.addTop(t1);
        wardrobe.addTop(t2);
        wardrobe.addBottom(b1);
        wardrobe.addOuterwear(o1);

        // Print out the wardrobe contents
        System.out.println("=== Wardrobe Contents ===");
        System.out.println("Tops:");
        for (ClothingItem item : wardrobe.getTops()) {
            System.out.println("  " + item);
        }

        System.out.println("Bottoms:");
        for (ClothingItem item : wardrobe.getBottoms()) {
            System.out.println("  " + item);
        }

        System.out.println("Outerwear:");
        for (ClothingItem item : wardrobe.getOuterwear()) {
            System.out.println("  " + item);
        }

        // Test remove
        wardrobe.removeTop(t2);
        System.out.println("\nAfter removing one top:");
        for (ClothingItem item : wardrobe.getTops()) {
            System.out.println("  " + item);
        }
    }
}