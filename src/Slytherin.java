import static java.lang.StringTemplate.STR;

public class Slytherin extends Hogwarts{
    private int cunning; //хитрость
    private int resolute; //решительность
    private int ambitiousness; //амбициозность
    private int ingenuity; //находчивость
    private int lustForPower; //жажда власти

    public Slytherin(String name, String lastname, int magicPower, int apparition, int cunning, int resolute, int ambitiousness, int ingenuity, int lustForPower) {
        super(name, lastname, magicPower, apparition);
        this.cunning = cunning;
        this.resolute = resolute;
        this.ambitiousness = ambitiousness;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Слизерин {хитрость=\{cunning}, решительность=\{resolute}, амбициозность=\{ambitiousness}, находчивость=\{ingenuity}, жажда власти=\{lustForPower}\{'}'}";
    }

    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Slytherin student) {
        int sum1 = this.cunning + this.resolute + this.ambitiousness + this.ingenuity + this.lustForPower;
        int sum2 = student.cunning + student.resolute + student.ambitiousness + student.ingenuity + student.lustForPower;
        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getLastname()} лучший Слизеринец, чем \{student.getName()} \{student.getLastname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getLastname()} лучший Слизеринец, чем \{this.getName()} \{this.getLastname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }

}
