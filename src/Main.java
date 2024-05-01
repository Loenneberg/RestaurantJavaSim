import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Table> tables = new ArrayList<>();
    private static Random random = new Random();


    public static void main(String[] args) {
        String restaurantName = generateRestaurantName();
        System.out.println("Welcome to " + restaurantName + "!");

        generateRandomTables();
        printTables();


    }

    private static String generateRestaurantName() {
        String[] adjective = {"Big", "Small", "Tasty", "Delicious", "Salty"};
        String[] nouns = {"Cafe", "Restaurant", "Bistro", "Diner", "Eatery", "Steakhouse", "Pizzeria", "Bakery"};
        Random random = new Random();
        return adjective[random.nextInt(adjective.length)] + " " + nouns[random.nextInt(nouns.length)];
    }

    public static void generateRandomTables() {
        int totalTables = 10 + random.nextInt(11); // Generiere eine zufällige Anzahl an Tischen zwischen 10 und 20
        int tablesForTwo = random.nextInt(totalTables / 2 + 1); // Zufällige Anzahl von 2-Personen-Tischen, mindestens die Hälfte
        int tablesForFour = (totalTables - tablesForTwo); // Der Rest wird zu 4-Personen-Tischen

        for (int i = 1; i <= tablesForTwo; i++) {
            tables.add(new Table(i, 2));

        }
        for (int i = tablesForTwo + 1; i <= totalTables; i++) {
            tables.add(new Table(i, 4));
        }
    }
    public static void printTables() {
        System.out.println("Tische im Restaurant:");
        for (Table table : tables) {
            System.out.println("Tisch Nr. " + table.getNumber() + " für " + table.getCapacity() + " Personen");
        }
    }


}