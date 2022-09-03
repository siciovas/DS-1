import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    public static void readPlayers(String filePath, LinkList<Player> outPutData)
    {
        FileInputStream fileStream =null;
        Scanner scanner =null;

        try {
            fileStream = new FileInputStream(filePath);
            scanner = new Scanner(fileStream, "UTF-8");
            while(scanner.hasNextLine())
            {
                String[] lines = scanner.nextLine().split(", ");
                outPutData.add(new Player(lines[0], lines[1], lines[2], lines[3], Integer.parseInt(lines[4]), lines[5],
                        Integer.parseInt(lines[6]), Integer.parseInt(lines[7])));
            }
            fileStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            if(scanner != null)
            {
                scanner.close();
            }
        }
    }

    public static void readTeams(String filePath, LinkList<Team> outPutData)
    {
        FileInputStream fileStream =null;
        Scanner scanner =null;

        try {
            fileStream = new FileInputStream(filePath);
            scanner = new Scanner(fileStream, "UTF-8");
            while(scanner.hasNextLine())
            {
                String[] lines = scanner.nextLine().split(", ");
                outPutData.add(new Team(lines[0], Integer.parseInt(lines[1]), Integer.parseInt(lines[2])));
            }
            fileStream.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally
        {
            if(scanner != null)
            {
                scanner.close();
            }
        }
    }
}
