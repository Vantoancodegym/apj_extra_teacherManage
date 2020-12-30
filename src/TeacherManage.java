import java.util.ArrayList;

public class TeacherManage {
    public static final int CHECKING_SALARY = 8000000;
    ArrayList<Teacher> teachersList=new ArrayList<>();
    public void addNewTeacher(Teacher teacher){
        teachersList.add(teacher);
    }
    public void displayTeacher(){
        ArrayList<Teacher> newList=new ArrayList<>();
        for (Teacher teacher:teachersList) {
            int actualSalary=teacher.getActualSalary();
            if (actualSalary>= CHECKING_SALARY){
                newList.add(teacher);
            }
        }
        if (newList.isEmpty()) System.out.println("Have no teacher has actual salary lager than 8000000VND");
        else System.out.println(newList);
    }
}
