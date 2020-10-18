import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Task[] tasks = new Task[50];
        Student[] students = new Student[6];
        for(int i = 0; i <50; i++) {
            switch ((new Random().nextInt(2))) {
                case 0 -> tasks[i] = new Test(i + 1);
                case 1 -> tasks[i] = new DragAndDrop(i + 1);
                case 2 -> tasks[i] = new Code(i + 1);
            }
        }
        Mentor mentor1 = new Mentor("Василий", "Помидоров", 30);
        Mentor mentor2 = new Mentor("Томас", "Андерсон", 27);
        for (int i = 0; i < 6; i++){
            Mentor mentor = (i%2==0) ? mentor1 : mentor2;
            students[i] = new Student("Иван" + Integer.toString(i), "Иванов", 20, mentor);
        }

        for(Student student : students){
            while (!student.isAllTaskDone()){
                int countTasks = getRandom(1, 50);
                System.out.printf("Студент %s начал решать %d задач\n", student.getName(), countTasks);
                student.solveTasks(countTasks, tasks);
            }
        }
    }

    private static int getRandom(int min, int max){
        Random random = new Random();
        int diff = max - min;
        int rand = random.nextInt(diff + 1);
        rand += min;
        return rand;
    }
}
