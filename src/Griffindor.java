public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("nobility: " + getNobility() + " honor: " + getHonor() + " bravery: " + getBravery());
    }

    public static void studentComparison(Griffindor one, Griffindor two) {
        int sumOne = one.getNobility() + one.getHonor() + one.getBravery();
        int sumTwo = two.getNobility() + two.getHonor() + two.getBravery();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Гриффиндорец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Гриффиндорец, чем " + one.getName());
        }
    }
}
