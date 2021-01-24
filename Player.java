public class Player{

    //instance variables
    private String playerName;
    private String position;
    private int playerOffensiveRating;
    private int playerDefensiveRating;

    public Player(){

    }

    public Player(String fn, int pOffRating, int pDefRating, String pPosition){
        this.playerName = fn;
        this.playerOffensiveRating = pOffRating;
        this.playerDefensiveRating = pDefRating;
        this.position = pPosition;
    }

    //Getter Methods
    public String getPlayerName(){
        return this.playerName;
    }

    public int getOffensiveRating(){
        return this.playerOffensiveRating;
    }

    public int getDefensiveRating(){
        return this.playerDefensiveRating;
    }

    public String getPosition(){
        return this.position;
    }

    //Setter Methods
    
    public void setDefensiveRating(int newPlayerDefensiveRating){
        this.playerDefensiveRating = newPlayerDefensiveRating;
    }

    public void setOffensiveRating(int newPlayerOffensiveRating){
        this.playerOffensiveRating = newPlayerOffensiveRating;
    }

    public void setPlayerName(String newPlayerName){
        this.playerName = newPlayerName;
    }

}