public class Season{
    
    //Instance Var
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;

    //Constructor

    public Season(Team pTeam1, Team pTeam2, Team pTeam3, Team pTeam4){

        this.team1 = pTeam1;
        this.team2 = pTeam2;
        this.team3 = pTeam3;
        this.team4 = pTeam4;

    }


    //Getter
    public void getSeasonGames(){
        for(int i = 0; i < 27; i++){
            System.out.println(new Game(this.team1, this.team2).playGame());
            System.out.println(new Game(this.team3, this.team4).playGame());
            System.out.println(new Game(this.team1, this.team3).playGame());
            System.out.println(new Game(this.team2, this.team4).playGame());
            System.out.println(new Game(this.team1, this.team4).playGame());
            System.out.println(new Game(this.team2, this.team3).playGame());
        }

        System.out.println("\t\tW\tL\tD\n");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(team1.getTeamAbrv() + " Record:     " + team1.getTeamWin() + "\t" + team1.getTeamLoss() + "\t" + team1.getTeamDraw());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(team2.getTeamAbrv() + " Record:     " + team2.getTeamWin() + "\t" + team2.getTeamLoss() + "\t" + team2.getTeamDraw());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(team3.getTeamAbrv() + " Record:     " + team3.getTeamWin() + "\t" + team3.getTeamLoss() + "\t" + team3.getTeamDraw());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println(team4.getTeamAbrv() + " Record:     " + team4.getTeamWin() + "\t" + team4.getTeamLoss() + "\t" + team4.getTeamDraw() + "\n");

        
    }
    

}