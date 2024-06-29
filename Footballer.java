class Footballer extends Sportsman {
    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public void scoringGoals() {
        System.out.println(getName() + " is scoring goals!");
    }
}
