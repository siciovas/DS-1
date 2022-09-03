import java.util.Iterator;

public class Player implements Comparable<Player>{
    private String team;
    private String name;
    private String surname;
    private String birth;
    private int height;
    private String position;
    private int games;
    private int points;

    public Player(String team, String name, String surname, String birth, int height, String position, int games, int points)
    {
        this.setTeam(team);
        this.setName(name);
        this.setSurname(surname);
        this.setBirth(birth);
        this.setHeight(height);
        this.setPosition(position);
        this.setGames(games);
        this.setPoints(points);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player()
    {
    }

    @Override
    public String toString()
    {
        return String.format("%-15s | %-15s | %-15s | %-15s | %10d | %-15s | %10d | %10d |", team, name, surname, birth,
                height, position, games, points);
    }

    @Override
    public boolean equals(Object other)
    {
        if(other == null)
        {
            return false;
        }

        if(this.team.equals(((Team) other).getTeamName()))
        {
            return true;
        }

        return false;
    }

    
    public int compareTo(Player other)
    {
      if(other == null)
      {
          return 1;
      }
      if (this.points == other.getPoints())
          if(this.games < other.getGames())
              return 1;
          else return 0;
      else if(this.points > other.getPoints())
          return 1;
      else return 0;


    }

}
