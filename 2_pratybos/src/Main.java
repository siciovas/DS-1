import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String playerData = "U11a.txt";
        String teamData = "U11b.txt";

    LinkList<Player> players = new LinkList<>();
    LinkList<Team> teams = new LinkList<>();

    DataReader.readPlayers(playerData, players);
    DataReader.readTeams(teamData, teams);

    System.out.println("Guards:");
    LinkList<Player> guards = TaskUtils.selectedByPositions(players, "gynėjas");
    guards.sort();
    for(int i = 0; i < guards.getCount(); i++)
    {
        System.out.println(i+1 + " " + guards.get(i));
    }

    System.out.println("Forwards:");
    LinkList<Player> forwards = TaskUtils.selectedByPositions(players, "puolėjas");
    forwards.sort();
        for(int i = 0; i < forwards.getCount(); i++)
        {
            System.out.println(i+1 + " " + forwards.get(i));
        }
        

    System.out.println("Centers:");
    LinkList<Player> centers = TaskUtils.selectedByPositions(players, "centras");
    centers.sort();
        for(int i = 0; i < centers.getCount(); i++)
        {
            System.out.println(i+1 + " " + centers.get(i));
        }

    System.out.println("Best team:");
    Team bestTeam = TaskUtils.bestTeam(teams);
    System.out.println(bestTeam);

    System.out.println("Best team's players:");
    LinkList<Player> bestTeamsPlayer = TaskUtils.bestTeamPlayers(players, bestTeam);
    bestTeamsPlayer.sort();
        for(int i = 0; i < bestTeamsPlayer.getCount(); i++)
        {
            System.out.println(i+1 + " " + bestTeamsPlayer.get(i));
        }

    System.out.println("Enter the command: ");
    Scanner in = new Scanner(System.in);
    String teamName = in.nextLine();
    LinkList<Player> selectedPlayers = TaskUtils.selectedPlayers(players, teamName);
    for(Player play : selectedPlayers)
    {
        System.out.println(play.toString());
    }
    }
}