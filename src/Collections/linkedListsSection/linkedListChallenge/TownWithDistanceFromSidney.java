package Collections.linkedListsSection.linkedListChallenge;

public class TownWithDistanceFromSidney {
    private String townName;
    private int distanceFromSidneyInKM;

    public TownWithDistanceFromSidney(String townName, int distanceFromSidneyInKM) {
        this.townName = townName;
        this.distanceFromSidneyInKM = Math.max(0, distanceFromSidneyInKM);
    }

    public TownWithDistanceFromSidney(String townName) {
        this(townName, 0);
    }

    public TownWithDistanceFromSidney() {
        this("Sydney", 0);
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public int getDistanceFromSidneyInKM() {
        return distanceFromSidneyInKM;
    }

    public void setDistanceFromSidneyInKM(int distanceFromSidneyInKM) {
        this.distanceFromSidneyInKM = distanceFromSidneyInKM;
    }

    public void printTownStats() {
        System.out.println("_".repeat(20));
        System.out.println("Town Name: " + townName);
        System.out.println("Distance from Sidney in KM: " + distanceFromSidneyInKM);
        System.out.println("_".repeat(20));
    }
}
