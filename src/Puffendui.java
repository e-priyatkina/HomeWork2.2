public class Puffendui extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Puffendui(String name, int witchcraft, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("hard work: " + getHardWork() + " loyalty: " + getLoyalty() + " honesty: " + getHonesty());
    }

    public static void studentComparison(Puffendui one, Puffendui two) {
        int sumOne = one.getHardWork() + one.getLoyalty() + one.getHonesty();
        int sumTwo = two.getHardWork() + two.getLoyalty() + two.getHonesty();
        if (sumOne > sumTwo) {
            System.out.println(one.getName() + " лучший Пуффендуец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Пуффендуец, чем " + one.getName());
        }
    }
}
