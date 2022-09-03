import java.util.Iterator;

public class Team implements Comparable<Team>{
    private String teamName;
    private int games;
    private int wonGames;

    public Team(String teamName, int games, int wonGames) {
        this.setTeamName(teamName);
        this.setGames(games);
        this.setWonGames(wonGames);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
    }

    public Team() {
    }

    @Override
    public String toString() {
        return String.format("%-15s | %10d | %10d |", teamName, games, wonGames);
    }

    @Override
    public boolean equals(Object other)
    {
        if(other == null)
        {
            return false;
        }

        if(this.teamName.equals(((Team) other).teamName))
        {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }




}
