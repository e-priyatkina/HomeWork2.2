public class Main {
    public static void main(String[] args) {
        Griffindor garri = new Griffindor("Гарри Поттер", 45, 65, 32, 54, 59);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 70, 54, 68, 39, 47);
        Griffindor ron = new Griffindor("Рон Уизли", 30, 42, 53, 49, 47);

        Slizerin drako = new Slizerin("Драко Малфой", 47, 69, 57, 40, 53, 58, 56);
        Slizerin grehem = new Slizerin("Грэхэм Монтегю", 59, 43, 61, 61, 54, 57, 66);
        Slizerin gregori = new Slizerin("Грегори Гойл", 54, 63, 55, 43, 64, 58, 50);

        Puffendui zaharia = new Puffendui("Захария Смит", 62, 65, 50, 49, 68);
        Puffendui sedrik = new Puffendui("Седрик Диггори", 45, 56, 56, 70, 66);
        Puffendui jastin = new Puffendui("Джастин Финч-Флетчли", 57, 54, 67, 49, 63);

        Kogtevran chjou = new Kogtevran("Чжоу Чанг", 41, 51, 68, 46, 69, 62);
        Kogtevran padma = new Kogtevran("Падма Патил", 51, 41, 46, 42, 43, 48);
        Kogtevran markus = new Kogtevran("Маркус Белби", 59, 58, 70, 51, 66, 59);

        zaharia.print();

        Kogtevran.studentComparison(chjou, padma);

        Hogwarts.studentComparison(markus, grehem);
    }
}