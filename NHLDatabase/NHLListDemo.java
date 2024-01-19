/**
 * CSCI 2110 | Assignment 3
 * @author Ivan Zareski | B00939596
 * @description This program computers and displays various statistical
 * calculations based on given NHL statistics
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NHLListDemo {

    /* main method, where the program starts running
     * @params: String [] : command line parameters
     * @return: none
     */

    public static void main(String[] args) throws FileNotFoundException {
        //prompt the user to enter a file which is stored in String filename
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = in.nextLine();

        //display the title of the results summary
        System.out.println("\nNHL Results Summary");

        //read the file using a Scanner
        File file = new File("src/" + filename);
        Scanner inputFile = new Scanner(file);

        //initialization
        NHLStats stats = new NHLStats();
        String line, player, position, team;
        int games, goals, assists, penalties, shots, winners;
        ArrayList<String> teams = new ArrayList<>();
        PlayerRecord rec;

        //while the file has more data to process:
        while (inputFile.hasNext()) {
            //read file data line by line
            line = inputFile.nextLine();
            //initialize a tokenizer to separate data by tabs
            StringTokenizer token = new StringTokenizer(line, "\t");

            //assign each variable to their tokenized data from the file
            player = token.nextToken();
            position = token.nextToken();
            team = token.nextToken();
            games = Integer.parseInt(token.nextToken());
            goals = Integer.parseInt(token.nextToken());
            assists = Integer.parseInt(token.nextToken());
            penalties = Integer.parseInt(token.nextToken());
            shots = Integer.parseInt(token.nextToken());
            winners = Integer.parseInt(token.nextToken());

            //create a new PlayerRecord object with these variables
            rec = new PlayerRecord(player, position, team, games, goals,
                    assists, penalties, shots, winners);
            //add this PlayerRecord object to the NHLStats object
            stats.add(rec);

            //fill ArrayList teams with each unique team name
            if (!teams.contains(team)) {
                teams.add(team);
            }
        }

        //close the file scanner
        inputFile.close();

        /* output which statistics are being displayed along with a call to its
         * associated method which displays the desired statistics
         */
        System.out.println("\nPlayers with highest points and their teams:");
        stats.mostPointsPlayer();
        System.out.println("\nMost aggressive players, their teams and their positions:");
        stats.mostAggressivePlayer();
        System.out.println("\nMost valuable players and their teams:");
        stats.mostValuablePlayer();
        System.out.println("\nMost promising players and their teams:");
        stats.mostPromisingPlayer();
        System.out.println("\nTeams that had the most number of penalty minutes:");
        stats.mostAggressiveTeam(teams);
        System.out.println("\nTeams that had the most number of game winning goals:");
        stats.mostWinnersTeam(teams);
    }
}