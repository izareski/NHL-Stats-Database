/**
 * CSCI 2110 | Assignment 3
 * @author Ivan Zareski | B00939596
 * @description This program computers and displays various statistical
 * calculations based on given NHL statistics
 */

import java.util.ArrayList;

public class NHLStats {

    /* NHLStats class, to compute and display various statistical calculations
     * @param records: record line of the NHL statistics
     * @return: none
     */

    //initialization
    private List<PlayerRecord> records;

    //constructor
    public NHLStats() {
        records = new List<>();
    }

    /* method: add
     * adds a given PlayerRecord record to the records list
     * @return: void
     */
    public void add(PlayerRecord record) {
        records.add(record);
    }

    /* method: mostPointsPlayer
     * calculates the player with the most points and their assigned team
     * @return: void
     */
    public void mostPointsPlayer() {
        int max = 0;        //initialize max points

        PlayerRecord most = records.first();    //most points record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //loop through all records to find record with team that has most points
        while (rec != null) {
            //if sum of goals and assists at current record is greater than max,
            if (rec.getGoals() + rec.getAssists() > max) {
                //update max to new most amount of points
                max = rec.getGoals() + rec.getAssists();
                //set most record equal to this current record
                most = rec;
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which record if any have a team with tied most points
        while (rec != null) {
            //if points equals most points and current record isn't already most
            if (rec.getGoals() + rec.getAssists() == max && rec != most) {
                //set same equal to the record with the tied most points
                same = rec;
            }

            //update the current record
            rec = records.next();
        }

        //print the player and team with the most points
        System.out.println(most.getPlayer() + " " + most.getTeam());

        //if same contains a record (not empty)
        if (same != null) {
            //print the player and team with the tied most points
            System.out.println(same.getPlayer() + " " + same.getTeam());
        }
    }

    /* method: mostAggressivePlayer
     * calculates the player with the most penalties along with their assigned
     * team and position
     * @return: void
     */
    public void mostAggressivePlayer() {
        int max = 0;        //initialize max penalties

        PlayerRecord most = records.first();    //most penalties record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //loop through records to find record with team that has most penalties
        while (rec != null) {
            //if penalties at current record is greater than max,
            if (rec.getPenalties() > max) {
                //update max to new most amount of penalties
                max = rec.getPenalties();
                //set most record equal to this current record
                most = rec;
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which record if any have a team with tied most penalties
        while (rec != null) {
            /* if number of penalties at current record equals most penalties,
             * and current record isn't already the most record
             */
            if (rec.getPenalties() == max && rec != most) {
                //set same equal to the record with the tied most penalties
                same = rec;
            }

            //update the current record
            rec = records.next();
        }

        //print the player, team and position with the most penalties
        System.out.println(most.getPlayer() + " " + most.getTeam() + " " +
                most.getPosition());

        //if same contains a record (not empty)
        if (same != null) {
            //print the player, team and position with the tied most penalties
            System.out.println(same.getPlayer() + " " + same.getTeam() + " " +
                    same.getPosition());
        }
    }

    /* method: mostValuablePlayer
     * calculates the player with the most game winning goals along with their
     * assigned team
     * @return: void
     */
    public void mostValuablePlayer() {
        int max = 0;        //initialize max winners

        PlayerRecord most = records.first();    //most winners record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //loop through records to find record with team that has most winners
        while (rec != null) {
            //if winners at current record is greater than max,
            if (rec.getWinners() > max) {
                //update max to new most amount of winners
                max = rec.getWinners();
                //set most record equal to this current record
                most = rec;
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which record if any have a team with tied most winners
        while (rec != null) {
            /* if number of winners at current record equals most winners,
             * and current record isn't already the most record
             */
            if (rec.getWinners() == max && rec != most) {
                //set same equal to the record with the tied most winners
                same = rec;
            }

            //update the current record
            rec = records.next();
        }

        //print the player and team with the most winners
        System.out.println(most.getPlayer() + " " + most.getTeam());

        //if same contains a record (not empty)
        if (same != null) {
            //print the player and team with the tied most winners
            System.out.println(same.getPlayer() + " " + same.getTeam());
        }
    }

    /* method: mostPromisingPlayer
     * calculates the player with the most shots on goal along with their
     * assigned team
     * @return: void
     */
    public void mostPromisingPlayer() {
        int max = 0;        //initialize max shots

        PlayerRecord most = records.first();    //most shots record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //loop through records to find record with team that has most shots
        while (rec != null) {
            //if shots at current record is greater than max,
            if (rec.getShots() > max) {
                //update max to new most amount of shots
                max = rec.getShots();
                //set most record equal to this current record
                most = rec;
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which record if any have a team with tied most shots
        while (rec != null) {
            /* if number of shots at current record equals most shots,
             * and current record isn't already the most record
             */
            if (rec.getShots() == max && rec != most) {
                //set same equal to the record with the tied most shots
                same = rec;
            }

            //update the current record
            rec = records.next();
        }

        //print the player and team with the most shots
        System.out.println(most.getPlayer() + " " + most.getTeam());

        //if same contains a record (not empty)
        if (same != null) {
            //print the player and team with the tied most shots
            System.out.println(same.getPlayer() + " " + same.getTeam());
        }
    }

    /* method: mostAggressiveTeam
     * calculates the teams with the most penalty minutes among all players in
     * the team, given a list of all teams
     * @return: void
     */
    public void mostAggressiveTeam(ArrayList<String> teams) {
        int max = 0;        //initialize max penalties
        int index = 0;      //initialize index of team with most penalties

        int[] perTeam = new int[teams.size()];  //array to hold team penalties
        PlayerRecord most = records.first();    //most penalties record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //fill perTeam[] with the total number of penalties from each team
        while (rec != null) {
            //loop through all team names
            for (int i = 0; i < teams.size(); i++) {
                //if the team name equals the team name in the current record,
                if (teams.get(i).equals(rec.getTeam())) {
                    //increment that players penalties to their team index
                    perTeam[i] += rec.getPenalties();
                }
            }

            //update the current record
            rec = records.next();
        }

        //calculate which team has the highest amount of penalties
        for (int i = 0; i < teams.size(); i++) {
            //loop through all teams, if current team is greater than max,
            if (perTeam[i] > max) {
                //update max to the new highest amount of penalties
                max = perTeam[i];
                //keep track of which index this occurred
                index = i;
            }
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which team is associated with the most penalties index
        while (rec != null) {
            //loop through all teams
            for (int i = 0; i < teams.size(); i++) {
                //if team name at index and team name in current record match,
                if (teams.get(index).equals(rec.getTeam())) {
                    //set most equal to the record with most penalties
                    most = rec;
                    break;
                }
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //check if there is another team with the same amount of penalties
        for (int i = 0; i < teams.size(); i++) {
            //loop through the amount of teams and all records
            while (rec != null) {
                /* if the amount of penalties equals the most penalties and the
                 * record with the most penalties does not equal the current
                 * record, therefore not the same team,
                 */
                if (perTeam[i] == max && rec != most) {
                    //set same equal to the record with the tied most penalties
                    same = rec;
                }

                //update the current record
                rec = records.next();
            }
        }

        //print the team with the most penalties
        System.out.println(most.getTeam());

        //if same contains a record (not empty)
        if (same != null) {
            //print the team with the tied most penalties
            System.out.println(same.getTeam());
        }
    }

    /* method: mostAggressiveTeam
     * calculates the teams with the most penalty minutes among all players in
     * the team, given a list of all teams
     * @return: void
     */
    public void mostWinnersTeam(ArrayList<String> teams) {
        int max = 0;        //initialize max winners
        int index = 0;      //initialize index of team with most winners

        int[] perTeam = new int[teams.size()];  //array to hold team winners
        PlayerRecord most = records.first();    //most winners record
        PlayerRecord same = null;               //same record for tied teams
        PlayerRecord rec = records.first();     //temporary team record

        //fill perTeam[] with the total number of winners from each team
        while (rec != null) {
            //loop through all team names
            for (int i = 0; i < teams.size(); i++) {
                //if the team name equals the team name in the current record,
                if (teams.get(i).equals(rec.getTeam())) {
                    //increment that players winners to their team index
                    perTeam[i] += rec.getWinners();
                }
            }

            //update the current record
            rec = records.next();
        }

        //calculate which team has the highest amount of winners
        for (int i = 0; i < teams.size(); i++) {
            //loop through all teams, if current team is greater than max,
            if (perTeam[i] > max) {
                //update max to the new highest amount of winners
                max = perTeam[i];
                //keep track of which index this occurred
                index = i;
            }
        }

        //reset rec to loop through all records
        rec = records.first();
        //find which team is associated with the most winners index
        while (rec != null) {
            //loop through all teams
            for (int i = 0; i < teams.size(); i++) {
                //if team name at index and team name in current record match,
                if (teams.get(index).equals(rec.getTeam())) {
                    //set most equal to the record with most winners
                    most = rec;
                    break;
                }
            }

            //update the current record
            rec = records.next();
        }

        //reset rec to loop through all records
        rec = records.first();
        //check if there is another team with the same amount of winners
        for (int i = 0; i < teams.size(); i++) {
            //loop through the amount of teams and all records
            while (rec != null) {
                /* if the amount of winners equals the most winners and the
                 * record with the most winners does not equal the current
                 * record, therefore not the same team,
                 */
                if (perTeam[i] == max && rec != most) {
                    //set same equal to the record with the tied most winners
                    same = rec;
                }

                //update the current record
                rec = records.next();
            }
        }

        //print the team with the most winners
        System.out.println(most.getTeam());

        //if same contains a record (not empty)
        if (same != null) {
            //print the team with the tied most winners
            System.out.println(same.getTeam());
        }
    }
}