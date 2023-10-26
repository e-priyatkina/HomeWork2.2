public class Hogwarts {
    private final String name;
    private final int witchcraft;
    private final int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void print() {
        System.out.println("Name: " + getName() + "\nwitchcraft: " + getWitchcraft() + " transgerrion: " + getTransgression());
    }

    public static void studentComparison(Hogwarts one, Hogwarts two) {
        int sumOne = one.getWitchcraft() + one.getTransgression();
        int sumTwo = one.getWitchcraft() + one.getTransgression();

        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " обладает бОльшей мощностью магии, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " обладает бОльшей мощностью магии, чем " + one.getName());
        }
    }
}
