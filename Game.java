public class Game{
    
    //Instance Variables 
    private Team team1;
    private Team team2;

    //Constructor
    public Game(Team pTeam1, Team pTeam2){
        this.team1 = pTeam1;
        this.team2 = pTeam2;
    }

    //Methods

    

    public String playGame(){
        int team1Score = team1.getTeamScore();
        int team2Score = team2.getTeamScore();

        if(team1Score > team2Score){
            team1.win++;
            team2.loss++;
            return "\n" + team1.getTeamName() + " are tonights winners against the " + team2.getTeamName() + "! \n" + team1.getTeamAbrv() + " " + team1Score + " - " + team2Score + " " + team2.getTeamAbrv();
        } else if(team1Score < team2Score){
            team1.loss++;
            team2.win++;
            return "\n" + team2.getTeamName() + " are tonights winners against the " + team1.getTeamName() + "! \n" + team1.getTeamAbrv() + " " + team1Score + " - " + team2Score + " " + team2.getTeamAbrv();
        } else if(team1Score == team2Score){
            int team1OT1Score = team1.getOvertimeScoring();
            int team2OT1Score = team2.getOvertimeScoring();
            if(team1OT1Score > team2OT1Score){
                team1.win++;
                team2.loss++;
                return team1.getTeamName() + " have won it in overtime!!!!";
            } else if(team1OT1Score < team2OT1Score){
                team2.win++;
                team1.loss++;
                return team2.getTeamName() + " have won it in overtime!!!!";
            } else if(team1OT1Score == team2OT1Score){
                int team1OT2Score = team1.getOvertimeScoring();
                int team2OT2Score = team2.getOvertimeScoring();
                if(team1OT2Score > team2OT2Score){
                    team1.win++;
                    team2.loss++;
                    return team1.getTeamName() + " have won it in overtime!!!!";
                } else if(team1OT2Score < team2OT2Score){
                    team2.win++;
                    team1.loss++;
                    return team2.getTeamName() + " have won it in overtime!!!!";
                
                } else {
                    return "Game ends in a draw!\n" + team1.getTeamAbrv() + team1.getTeamScore() + " - " + team2.getTeamScore() + team2.getTeamAbrv();
                    
                }
            } 

        } 
        return "Something went wrong";
    }

}