import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри","Поттер",random(), random(), random(), random(), random());
        Griffindor hermioneGranger = new Griffindor("Гермиона","Грейнджер", random(), random(), random(), random(), random());
        Griffindor ronWeasley = new Griffindor("Рон","Уизли", random(), random(), random(), random(), random());

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", random(), random(), random(), random(), random(), random(), random());
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", random(), random(), random(), random(), random(), random(), random());
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", random(), random(), random(), random(), random(), random(), random());

        Hufflepuff zachariasSmith = new Hufflepuff("Захария", "Смит", random(), random(), random(), random(), random());
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", random(), random(), random(), random(), random());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Джастин Финч-Флетчли", random(), random(), random(), random(), random());

        Ravenclaw choChang= new Ravenclaw("Чжоу","Чанг", random(),random(), random(), random(), random(), random());
        Ravenclaw padmaPatil= new Ravenclaw("Падма","Патил", random(),random(), random(), random(), random(), random());
        Ravenclaw marcusBelby= new Ravenclaw("Маркус","Белби", random(),random(), random(), random(), random(), random());

        System.out.println(hermioneGranger.toString());
        System.out.println(ronWeasley.toString());

        harryPotter.compareStudents(hermioneGranger);
        harryPotter.compareStudents(dracoMalfoy);

    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(101);
    }
}