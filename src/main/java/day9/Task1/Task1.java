package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Профессор Хиггинс", "Английская фонетика");
        Student student = new Student("Поликарп", "Старательные");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
