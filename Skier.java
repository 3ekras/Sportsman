class Skier extends Sportsman {
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    public void skiing() {
        System.out.println(getName() + " is skiing downhill!");
    }
}