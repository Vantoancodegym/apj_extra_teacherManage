import java.util.Scanner;

public class Main {
    public static TeacherManage teacherManage=new TeacherManage();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new teacher");
            System.out.println("2. Display teachers who has salary larger than 8000000VND");
            System.out.println("0. Exit");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewTeacher();
                    break;
                case 2:
                    teacherManage.displayTeacher();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static void addNewTeacher(){
        System.out.println("Enter name");
        String name= scanner.nextLine();
        System.out.println("Enter birthday");
        String birthday=scanner.nextLine();
        System.out.println("Enter homeTown");
        String homeTown=scanner.nextLine();
        System.out.println("Enter baseSalary");
        int baseSalary=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter bonus");
        int bonus=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter panalty");
        int penalty=Integer.parseInt(scanner.nextLine());
        Teacher teacher=new Teacher(name,birthday,homeTown,baseSalary,bonus,penalty);
        teacherManage.addNewTeacher(teacher);
    }

}
