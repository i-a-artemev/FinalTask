import java.util.Random;

public class Mentor extends Person implements Staff {
    private boolean mood;
    private final Random constant;

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.mood = true;
        this.constant = new Random();
    }

    public boolean checkCode(Task task) {
        if (constant.nextInt() > 1000) {
            mood = true;
            System.out.printf("Задача %d принята.\n", task.getNumber());
        } else {
            mood = false;
            System.out.printf("Задача %d не принята.\n", task.getNumber());
        }
        return mood;
    }

    @Override
    public void helpStudent(Student student) {
        System.out.printf("Не вешай нос гардемарин %s\n", student.getName());
    }
}
