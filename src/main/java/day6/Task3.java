package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иван Жмыхов");
        Teacher teacher = new Teacher("дон Периньон", "астрология");
        teacher.evaluate(student);
    }
}
