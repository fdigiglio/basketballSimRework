import java.util.ArrayList;
import java.util.Scanner;

public class Team{

    //Instance Variables
    private String teamName;
    private String teamAbrv;
    private int teamOffensiveRating;
    private int teamDefensiveRating;
    private int teamScore;
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    public static ArrayList<Player> player;
    public int win = 0;
    public int loss = 0;
    public int draw = 0;


    //Constructor

    public Team(){

    }

    public Team(String pTeamName, String pTeamAbrv ,Player pPlayer1, Player pPlayer2, Player pPlayer3, Player pPlayer4, Player pPlayer5){
        this.teamName = pTeamName;
        this.teamAbrv = pTeamAbrv;
        this.player1 = pPlayer1;
        this.player2 = pPlayer2;
        this.player3 = pPlayer3;
        this.player4 = pPlayer4;
        this.player5 = pPlayer5;

    }

    //Getter Methods

    public int getTeamOffensiveRating(){
        int offTeamRate = (this.player1.getOffensiveRating() + this.player2.getOffensiveRating() + this.player3.getOffensiveRating() + this.player4.getOffensiveRating() + this.player5.getOffensiveRating()) / 5;
        return offTeamRate;
    }

    public int getTeamDefensiveRating(){
        int defTeamRate = (this.player1.getDefensiveRating() + this.player2.getDefensiveRating() + this.player3.getDefensiveRating() + this.player4.getDefensiveRating() + this.player5.getDefensiveRating()) / 5;
        return defTeamRate;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public String getTeamAbrv(){
        return this.teamAbrv;
    }

    public int getTeamScore(){
        int ratingPer = (getTeamOffensiveRating() + getTeamDefensiveRating()) / 2; 
        int scoringBonus;
        if(ratingPer > 90){
            scoringBonus = 35;
        } else if(ratingPer > 80){
            scoringBonus = 30;
        } else if(ratingPer > 70){
            scoringBonus = 25;
        } else if(ratingPer > 60){
            scoringBonus = 20;
        } else {
            scoringBonus = 10;
        }
        scoringBonus += ratingPer;
        
        int randScore = (int)(Math.random() * (scoringBonus - ratingPer)) + ratingPer;
        return randScore;
    }

    public int getScoringMax(){
        int ratingPer = (getTeamOffensiveRating() + getTeamDefensiveRating()) / 2; 
        int scoringMax;
        if(ratingPer > 90){
            scoringMax = 35;
        } else if(ratingPer > 80){
            scoringMax = 30;
        } else if(ratingPer > 70){
            scoringMax = 25;
        } else if(ratingPer > 60){
            scoringMax = 20;
        } else {
            scoringMax = 10;
        }
        return scoringMax;
    }

    public int getScoringMin(){
        int ratingPer = (getTeamOffensiveRating() + getTeamDefensiveRating()) / 2;
        int minScoring = ratingPer / 5; 
        return minScoring;
    }

    public int getOvertimeScoring(){
        int randScore = (int)(Math.random() * (getScoringMax() - getScoringMin())) + getScoringMin();
        return randScore;
    }

    public int getTeamWin(){
        return this.win;
    }

    public int getTeamLoss(){
        return this.loss;
    }

    public int getTeamDraw(){
        return this.draw;
    }
    
    

}