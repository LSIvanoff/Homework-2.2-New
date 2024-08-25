public class Griffindor extends Hogwarts{
    private int generosity; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Griffindor(String name, String lastname, int magicPower, int apparition, int generosity, int honor, int bravery) {
        super(name, lastname, magicPower, apparition);
        this.generosity = generosity;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Гриффиндор {благородство=\{generosity}, честь=\{honor}, храбрость=\{bravery}\{'}'}";
    }

    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Griffindor student) {
        int sum1 = this.generosity + this.honor + this.bravery;
        int sum2 = student.generosity + student.honor + student.bravery;
        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getLastname()} лучший Гриффиндорец, чем \{student.getName()} \{student.getLastname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getLastname()} лучший Гриффиндорец, чем \{this.getName()} \{this.getLastname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }

}
