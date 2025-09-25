
import java.util.ArrayList;

// Entity class
class Team {
    private String name;
    private int rank;
    private ArrayList<String> players;

    // Constructor
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Setter for rank
    public void setRank(int rank) {
        this.rank = rank;
    }

    // Method to add a player
    public void addPlayer(String player) {
        players.add(player);
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hold: ").append(name)
          .append(" Rang: ").append(rank).append("\n");
        sb.append("Players:").append("\n");
        for (String player : players) {
            sb.append(" - ").append(player).append("\n");
        }
        return sb.toString();
    }
}

// Client class
public class Main {
    public static void main(String[] args) {
        // Step 1.g: Create instance
        Team team1 = new Team("Silkeborg");
        team1.setRank(3);
        team1.addPlayer("Alice");
        team1.addPlayer("Bob");
        team1.addPlayer("Charlie");
        System.out.println(team1);

        // Step 1.k: Create more teams
        Team team2 = new Team("FCK");
        team2.setRank(1);
        team2.addPlayer("David");
        team2.addPlayer("Eva");

        Team team3 = new Team("Brøndby");
        team3.setRank(2);
        team3.addPlayer("Frank");

        Team team4 = new Team("Vejle Boldklub");
        team4.setRank(4);
        team4.addPlayer("George");

        Team team5 = new Team("FC midtjylland");
        team5.setRank(5);
        team5.addPlayer("Hannah");

        Team team6 = new Team("DBU");
        team6.setRank(6);
        team6.addPlayer("Ian");

        // Print them
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
        System.out.println(team6);
    }
}
