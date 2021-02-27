package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    private Random rand = new Random();
    private int minMark = 2;
    private int maxMark = 5;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int markNum = rand.nextInt(maxMark + 1 - minMark) + minMark;

        String mark = this.getMarkWord(markNum);

        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s",
                this.name,
                student.getName(),
                this.subject,
                mark
        );
    }

    private String getMarkWord(int markNum) {
        String mark;

        switch (markNum) {
            case 5:
                mark = "отлично";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            default:
                mark = "неудовлетворительно";
        }

        return mark;
    }
}
