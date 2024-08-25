public class Hufflepuff extends Hogwarts{
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int integrity; //честность

    public Hufflepuff(String name, String lastname, int magicPower, int apparition, int diligence, int loyalty, int integrity) {
        super(name, lastname, magicPower, apparition);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.integrity = integrity;
    }

    @Override
    public String toString() {
        return STR."\{super.toString()}; Пуффендуй {трудолюбие=\{diligence}, верность=\{loyalty}, честностьь=\{integrity}\{'}'}";
    }

    public void printParameters() {
        System.out.println(this);
    }

    public void compareStudents(Hufflepuff student) {
        int sum1 = this.diligence + this.loyalty + this.integrity;
        int sum2 = student.diligence + student.loyalty + student.integrity;
        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getLastname()} лучший Пуффендуец, чем \{student.getName()} \{student.getLastname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getLastname()} лучший Пуффендуец, чем \{this.getName()} \{this.getLastname()}");
        } else {
            System.out.println("Студенты равны");
        }
    }

}
