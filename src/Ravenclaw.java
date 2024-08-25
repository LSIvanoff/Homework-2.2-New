public class Ravenclaw extends Hogwarts{
    private int intellect; //ум
    private int wisdom; //мудрость
    private int wittiness; //остроумие
    private int creativity; //творческий талант

    public Ravenclaw(String name, String lastname, int magicPower, int apparition, int intellect, int wisdom, int wittiness, int creativity) {
        super(name, lastname, magicPower, apparition);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Когтевран {ум=\{intellect}, мудрость=\{wisdom}, остроумие=\{wittiness}, творческий талант=\{creativity}\{'}'}";
    }

    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Ravenclaw student) {
        int sum1 = this.intellect + this.wisdom + this.wittiness + this.creativity;
        int sum2 = student.intellect + student.wisdom + student.wittiness + student.creativity;
        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getLastname()} лучший Когтевранец, чем \{student.getName()} \{student.getLastname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getLastname()} лучший Когтевранец, чем \{this.getName()} \{this.getLastname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }
}