public class Main{
    public static void main(String[] args){
        
        //Team 1 (Blazers)

        Player dame = new Player("Damian Lillard" , 96, 88, "PG");
        Player cj = new Player("CJ McCollum", 91, 84, "SG");
        Player trent = new Player("Gary Trent Jr.", 82, 79, "SF");
        Player roco = new Player("Robert Covington", 77, 89, "PF");
        Player nurk = new Player("Jusif Nurkic", 84, 82, "C");

        Team blazers = new Team("Portland Trailblazers", "POR", dame, cj, trent, roco, nurk);
        
        //Team 2 (Heat)
        
        Player herro = new Player("Tyler Herro", 86, 80, "PG");
        Player duncan = new Player("Duncan Robinson", 85, 83, "SG");
        Player jimmy = new Player("Jimmy Butler", 87, 92, "SF");
        Player precious = new Player("Giannis Attentokoump", 95, 97, "PF");
        Player bam = new Player("Bam Adebayo", 84, 89, "C");

        Team heat = new Team("Miami Heat", "MIA",herro, duncan, jimmy, precious, bam);
       
        //Team 3 (Lakers)

        Player dennis = new Player("Dennis Shroeder", 83, 81, "PG");
        Player kcp = new Player("Kentavious Caldwell-Poupe", 79, 81, "SG");
        Player bron = new Player("LeBron James", 97, 96, "SF");
        Player aDavis = new Player("Anthony Davis", 94, 97, "PF");
        Player marcGasol = new Player("Marc Gasol", 81, 84, "C");

        Team lakers = new Team("Los Angeles Lakers", "LAL",dennis, kcp, bron, aDavis, marcGasol);
        
        //Team 4 (Nets)
        
        Player kyrie = new Player("Kyrie Irving", 92, 89, "PG");
        Player harden = new Player("James Harden", 97, 85, "SG");
        Player jHarris = new Player("Joe Harris", 87, 83, "SF");
        Player kDurant = new Player("Kevin Durant", 98, 91, "SF");
        Player dJordan = new Player("DeAndre Jordan", 75, 73, "C");

        Team nets = new Team("Brooklyn Nets", "BKN",kyrie, harden, jHarris, kDurant, dJordan);
        
        new Season(blazers, heat, lakers, nets).getSeasonGames();

        
    }
}