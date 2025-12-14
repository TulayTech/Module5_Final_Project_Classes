/**
 * Final Project: Virtual Wardrobe
 *
 * Simple console test for Wardrobe and ClothingItem subclasses.
 */
public class WardrobeTest {

    public static void main(String[] args) {

        // Create a wardrobe to store items
        Wardrobe wardrobe = new Wardrobe();

        // Create sample items
        TopItem top1 = new TopItem(
                "White Dress Shirt",
                "Dress Shirt",
                "Slim fit, long sleeve",
                "White",
                "TOP-WHT-DRS"
        );

        TopItem top2 = new TopItem(
                "Black T-Shirt",
                "T-Shirt",
                "Casual crew neck",
                "Black",
                "TOP-BLK-TSH"
        );

        BottomItem bottom1 = new BottomItem(
                "Navy Dress Pants",
                "Dress Pants",
                "Slim fit stretch fabric",
                "Navy",
                "BOT-NVY-DRS"
        );

        OuterwearItem outerwear1 = new OuterwearItem(
                "Gray Blazer",
                "Blazer",
                "Business blazer, structured shoulders",
                "Gray",
                "OUT-GRY-BLZ"
        );

        ShoeItem shoe1 = new ShoeItem(
                "Brown Dress Shoes",
                "Dress Shoes",
                "Formal leather shoes",
                "Brown",
                "SHO-BRN-DRS"
        );

        HatItem hat1 = new HatItem(
                "Black Baseball Cap",
                "Baseball Cap",
                "Casual hat for sunny days",
                "Black",
                "HAT-BLK-CAP"
        );

        // Add items to the wardrobe
        wardrobe.addTop(top1);
        wardrobe.addTop(top2);
        wardrobe.addBottom(bottom1);
        wardrobe.addOuterwear(outerwear1);
        wardrobe.addShoe(shoe1);
        wardrobe.addHat(hat1);

        // Print wardrobe contents
        System.out.println("=== Wardrobe Contents ===");

        System.out.println("Tops:");
        for (int i = 0; i < wardrobe.getTopList().size(); i++) {
            System.out.println("  " + wardrobe.getTopList().get(i));
        }

        System.out.println("Bottoms:");
        for (int i = 0; i < wardrobe.getBottomList().size(); i++) {
            System.out.println("  " + wardrobe.getBottomList().get(i));
        }

        System.out.println("Outerwear:");
        for (int i = 0; i < wardrobe.getOuterwearList().size(); i++) {
            System.out.println("  " + wardrobe.getOuterwearList().get(i));
        }

        System.out.println("Shoes:");
        for (int i = 0; i < wardrobe.getShoeList().size(); i++) {
            System.out.println("  " + wardrobe.getShoeList().get(i));
        }

        System.out.println("Hats:");
        for (int i = 0; i < wardrobe.getHatList().size(); i++) {
            System.out.println("  " + wardrobe.getHatList().get(i));
        }

        // Remove one top and show the result
        wardrobe.removeTop(top2);

        System.out.println("\nAfter removing one top:");
        for (int i = 0; i < wardrobe.getTopList().size(); i++) {
            System.out.println("  " + wardrobe.getTopList().get(i));
        }
    }
}