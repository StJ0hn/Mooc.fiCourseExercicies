package Part_I.Module_04.Ex_31_SportStatistics;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File:");
        String file = sc.nextLine();
        System.out.println("Team:");
        String team = sc.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanner = new Scanner(Paths.get("src/Part_I/Module_04/Ex_31_SportStatistics/" + file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);
                if (homeTeam.equals(team) || visitingTeam.equals(team)){
                    games++;
                }
                if (homeTeam.equals(team)){
                    if (homeTeamPoints > visitingTeamPoints){
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (visitingTeam.equals(team)) {
                    if (visitingTeamPoints > homeTeamPoints){
                        wins++;
                    } else {
                        losses ++;
                    }
                }
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception);;
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
