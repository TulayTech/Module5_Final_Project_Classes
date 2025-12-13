/**
 **Test class for OutfitGenerator.
 * Builds a Wardrobe, creates Events, and prints generated outfits.
 */
public class OutfitGeneratorTest {

    public static void main(String[] args) {
        // Build a sample wardrobe
        Wardrobe wardrobe = new Wardrobe();

        wardrobe.addTop(new TopItem(
                "White Dress Shirt", "Dress Shirt",
                "Slim fit business shirt", "White", "TOP-WHT-DRS"));

        wardrobe.addTop(new TopItem(
                "Blue Polo", "Polo",
                "Casual polo for warm days", "Blue", "TOP-BLU-POL"));

        wardrobe.addBottom(new BottomItem(
                "Navy Dress Pants", "Dress Pants",
                "Good for business events", "Navy", "BOT-NVY-DRS"));

        wardrobe.addBottom(new BottomItem(
                "Black Jeans", "Jeans",
                "Casual denim", "Black", "BOT-BLK-JNS"));

        wardrobe.addOuterwear(new OuterwearItem(
                "Charcoal Blazer", "Blazer",
                "Business blazer for cold offices", "Charcoal", "OUT-CHR-BLZ"));

        wardrobe.addShoes(new TopItem(
                "Brown Dress Shoes", "Shoes",
                "Formal leather shoes", "Brown", "SHO-BRN-DRS"));

        wardrobe.addShoes(new TopItem(
                "White Sneakers", "Shoes",
                "Casual everyday sneakers", "White", "SHO-WHT-SNK"));

        wardrobe.addHat(new TopItem(
                "Black Baseball Cap", "Hat",
                "Casual hat for sunny days", "Black", "HAT-BLK-CAP"));

        // Create an OutfitGenerator
        OutfitGenerator generator = new OutfitGenerator(wardrobe);

        // Test 1: Business event on a cold day
        Event businessEvent = new Event(
                "Job Interview",
                "Downtown Office",
                "9:00 AM",
                "Business",
                "Cold"
        );

        generator.generateOutfit(businessEvent);
        System.out.println("=== Business / Cold Event ===");
        System.out.println(generator.getOutfitSummaryText());

        // Test 2: Casual event on a sunny day
        Event casualEvent = new Event(
                "Picnic in the Park",
                "City Park",
                "2:00 PM",
                "Casual",
                "Sunny"
        );

        generator.generateOutfit(casualEvent);
        System.out.println("\n=== Casual / Sunny Event ===");
        System.out.println(generator.getOutfitSummaryText());

        // Test 3: Invalid event (missing type)
        Event invalidEvent = new Event(
                "",         // Missing name
                "Somewhere",
                "Anytime",
                "",         // Missing type
                "Warm"
        );

        generator.generateOutfit(invalidEvent);
        System.out.println("\n=== Invalid Event ===");
        System.out.println(generator.getOutfitSummaryText());
    }
}