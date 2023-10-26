public class Slizerin extends Hogwarts {
    private final int cunning;
    private final int decisiveness;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slizerin(String name, int witchcraft, int transgression, int cunning, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("cunning: " + getCunning() + " decisiveness: " + getDecisiveness() + " ambition: " + getAmbition()
                + " resourcefulness: " + getResourcefulness() + " last for power: " + getLustForPower());
    }

    public static void studentComparison(Slizerin one, Slizerin two) {
        int sumOne = one.getCunning() + one.getDecisiveness() + one.getAmbition() + one.getResourcefulness() + one.getLustForPower();
        int sumTwo = two.getCunning() + two.getDecisiveness() + two.getAmbition() + two.getResourcefulness() + two.getLustForPower();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Слизеринец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Слизеринец, чем " + one.getName());
        }
    }
}
