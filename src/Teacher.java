public class Teacher {
    private String name;
    private String birthday;
    private String homeTown;
    private int baseSalary;
    private int bonus;
    private int penalty;
    public Teacher(){};

    public Teacher(String name, String birthday, String homeTown, int baseSalary, int bonus, int penalty) {
        this.name = name;
        this.birthday = birthday;
        this.homeTown = homeTown;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }
    public int getActualSalary(){
        return baseSalary+bonus-penalty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", penalty=" + penalty +
                '}';
    }
}
