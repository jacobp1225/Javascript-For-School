import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<CustomObject> gameList = new ArrayList<>();
        
        gameList.add(new CustomObject("Minecraft", "PC", 50));
        gameList.add(new CustomObject("Zelda: Breath of the Wild", "Nintendo Switch", 120));
        gameList.add(new CustomObject("Super Mario 64", "Nintendo 64", 15));
        gameList.add(new CustomObject("Hades", "PC", 45));
        gameList.add(new CustomObject("Elden Ring", "PlayStation 5", 150));
        gameList.add(new CustomObject("Stardew Valley", "Switch", 200));
        gameList.add(new CustomObject("Portal 2", "PC", 10));
        gameList.add(new CustomObject("Halo 3", "Xbox 360", 80));
        gameList.add(new CustomObject("Tetris", "Mobile", 5));
        gameList.add(new CustomObject("Cyberpunk 2077", "PC", 65));

        System.out.println("--- Before Sorting ---");
        for (CustomObject game : gameList) {
            game.displayInfo();
        }

        Collections.sort(gameList);

        System.out.println("\n--- After Sorting (By Hours Played) ---");
        for (CustomObject game : gameList) {
            game.displayInfo();
      }

        // array out-of-bounds exception
        String[] sampleGames = {"Minecraft", "Hades", "Portal 2"};
        try {
            // Valid indices are 0, 1, and 2; index 5 is out of bounds
            System.out.println("\nAccessing game at index 5: " + sampleGames[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Tried to access an item outside the array's valid index range.");
        }

        // divide-by-zero exception
        try {
            int totalHours = 120;
            int divisor = 0;
            int averageHours = totalHours / divisor;
            System.out.println("Average hours: " + averageHours);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tried to divide a whole number by zero.");
        }

        System.out.println("\nThe program has caught the errors and closed without crashing.");
    }
}