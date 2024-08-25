import static java.lang.StringTemplate.STR;

public abstract class Hogwarts {
    private String name;
    private String lastname;
    private int magicPower; //магическая сила
    private int apparition; //Трансгрессия

    public Hogwarts(String name, String lastname, int magicPower, int apparition) {
        this.name = name;
        this.lastname = lastname;
        this.magicPower = magicPower;
        this.apparition = apparition;
    }

    @Override
    public String toString() {
        return STR."Hogwarts{Имя='\{name}\{'\''}, Фамилия='\{lastname}\{'\''}, Магическая сила=\{magicPower}, расстояние трансгрессии=\{apparition}\{'}'}";
    }
    public abstract void printParameters();

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void compareStudents(Hogwarts student) {
        int sum1 = this.magicPower + this.apparition;
        int sum2 = student.magicPower + student.apparition;

        if (sum1 > sum2) {
            System.out.println(STR."\{this.getName()} \{this.getLastname()} обладает бОльшей мощностью магии, чем \{student.getName()} \{student.getLastname()}");
        } else if (sum1 < sum2) {
            System.out.println(STR."\{student.getName()} \{student.getLastname()} обладает бОльшей мощностью магии, чем \{this.getName()} \{this.getLastname()}");
        } else {
            System.out.println("Студенты равны по силе магии и расстоянию трансгрессии");
        }
    }
}