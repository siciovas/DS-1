public class TaskUtils
{
    public static LinkList<Player> selectedByPositions(LinkList<Player> players, String position)
    {
        LinkList<Player> positionList = new LinkList<>();

        for(Player play : players)
        {
            if(play.getPosition().equals(position))
            {
                positionList.add(play);
            }
        }
        return positionList;
    }

    public static Team bestTeam(LinkList<Team> teams)
    {
        Team bestTeam = null;
        int maximum = Integer.MIN_VALUE;

        for(Team team : teams)
        {
            if (team.getWonGames() > maximum) {
                maximum = team.getWonGames();
                bestTeam = team;
            }
        }
        return bestTeam;
    }

    public static LinkList<Player> bestTeamPlayers(LinkList<Player> players, Team team)
    {
        LinkList<Player> player = new LinkList<>();

        for(Player play : players)
        {
            if(play.equals(team))
            {
                player.add(play);
            }
        }
        return player;
    }

    public static LinkList<Player> selectedPlayers(LinkList<Player> players, String teamName)
    {
        LinkList<Player> selected = new LinkList<>();

        for(Player play : players)
        {
            if(play.getTeam().equals(teamName))
            {
                selected.add(play);
            }
        }
        return selected;
    }


}
