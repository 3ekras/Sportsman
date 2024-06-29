class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    public void hittingPuck() {
        System.out.println(getName() + " is hitting the puck!");
    }
}

