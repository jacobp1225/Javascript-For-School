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
    }
}