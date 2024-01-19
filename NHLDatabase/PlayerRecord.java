/**
 * CSCI 2110 | Assignment 3
 * @author Ivan Zareski | B00939596
 * @description This program computers and displays various statistical
 * calculations based on given NHL statistics
 */

public class PlayerRecord  {

    /* PlayerRecord class, to assign NHL statistical variables
     * @param player: name of the player
     * @param position: position of the player
     * @param team: team of the player
     * @param games: amount of games played by player
     * @param goals: amount of goals made by player
     * @param assists: amount of assists made by player
     * @param penalties: amount of penalties made by player
     * @param shots: amount of shots made by player
     * @param winners: amount of game winning shots made by player
     * @return: none
     */

    //initialization
    private String player;
    private String position;
    private String team;
    private int games;
    private int goals;
    private int assists;
    private int penalties;
    private int shots;
    private int winners;

    //constructor
    public PlayerRecord(String player, String position, String team, int games,
                        int goals, int assists, int penalties, int shots,
                        int winners) {
        this.player = player;
        this.position = position;
        this.team = team;
        this.games = games;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
        this.shots = shots;
        this.winners = winners;
    }

    //getters for each variable
    public String getPlayer() {
        return player;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public int getShots() {
        return shots;
    }

    public int getWinners() {
        return winners;
    }
}