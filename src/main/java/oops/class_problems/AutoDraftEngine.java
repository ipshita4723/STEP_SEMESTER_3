import java.util.Arrays;

class Player implements Comparable<Player> {
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }
    public String getName() { return name; }
    public int getMatchesPlayed() { return matchesPlayed; }
    public boolean isInjured() { return injured; }
    public int compareTo(Player other) { return Double.compare(other.battingAverage, this.battingAverage); }
}

public class AutoDraftEngine {
    public static boolean isDraftable(int matchesPlayed) { return matchesPlayed >= 10; }
    public static boolean isDraftable(int matchesPlayed, boolean injured) { return matchesPlayed >= 5 && !injured; }
    public static String draftAndRank(Player[] players) {
        int draftableCount = 0;
        for (Player p : players) if (isDraftable(p.getMatchesPlayed()) || isDraftable(p.getMatchesPlayed(), p.isInjured())) draftableCount++;
        Player[] draftable = new Player[draftableCount];
        int idx = 0;
        for (Player p : players) if (isDraftable(p.getMatchesPlayed()) || isDraftable(p.getMatchesPlayed(), p.isInjured())) draftable[idx++] = p;
        Arrays.sort(draftable);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            sb.append(i + 1).append(". ").append(draftable[i].getName());
            if (i < draftable.length - 1) sb.append(" | ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Player[] players = {new Player("Virat", 15, 48.0, false), new Player("Rahul", 7, 55.0, false), new Player("Sameer", 3, 60.0, false), new Player("Dev", 12, 20.0, true)};
        System.out.println(draftAndRank(players));
    }
}
