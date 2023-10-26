public class Kogtevran extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Kogtevran(String name, int witchcraft, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("mind: " + getMind() + " wisdom: " + getWisdom() + " wit: " + getWit() + " creation: " + getCreation());
    }

    public static void studentComparison(Kogtevran one, Kogtevran two) {
        int sumOne = one.getMind() + one.getWisdom() + one.getWit() + one.getCreation();
        int sumTwo = two.getMind() + two.getWisdom() + two.getWit() + two.getCreation();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Когтевранец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Когтевранец, чем " + one.getName());
        }
    }
}
