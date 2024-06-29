public class Main {
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("John Doe", "Team A", 25);
        Footballer footballer2 = new Footballer("Jane Smith", "Team B", 22);


        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Mike Johnson", "Team C", 28);
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Emily Davis", "Team D", 24);


        Skier skier1 = new Skier("David Brown", "Team E", 30);
        Skier skier2 = new Skier("Sophia Wilson", "Team F", 27);


        System.out.println(footballer1.getName() + " from " + footballer1.getTeam() + ", age " + footballer1.getAge());
        footballer1.performAction();
        footballer1.scoringGoals();

        System.out.println(footballer2.getName() + " from " + footballer2.getTeam() + ", age " + footballer2.getAge());
        footballer2.performAction();
        footballer2.scoringGoals();

        System.out.println(hockeyPlayer1.getName() + " from " + hockeyPlayer1.getTeam() + ", age " + hockeyPlayer1.getAge());
        hockeyPlayer1.performAction();
        hockeyPlayer1.hittingPuck();

        System.out.println(hockeyPlayer2.getName() + " from " + hockeyPlayer2.getTeam() + ", age " + hockeyPlayer2.getAge());
        hockeyPlayer2.performAction();
        hockeyPlayer2.hittingPuck();

        System.out.println(skier1.getName() + " from " + skier1.getTeam() + ", age " + skier1.getAge());
        skier1.performAction();
        skier1.skiing();

        System.out.println(skier2.getName() + " from " + skier2.getTeam() + ", age " + skier2.getAge());
        skier2.performAction();
        skier2.skiing();
    }
}
