public class CustomObject implements Comparable<CustomObject> {

    private String title;
    private String platform;
    private int hoursPlayed;

    public CustomObject(String title, String platform, int hoursPlayed) {
        this.title = title;
        this.platform = platform;
        this.hoursPlayed = hoursPlayed;
    }


    @Override
    public int compareTo(CustomObject other) {
        return Integer.compare(this.hoursPlayed, other.hoursPlayed);
        
 
    }
public void displayInfo() {
    System.out.println("Game: " + title + " | Platform: " + platform + " | Total Hours Played: " + hoursPlayed);
}


}