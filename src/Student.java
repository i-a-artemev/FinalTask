public class Student extends Person{
    private int countTaskDone;
    static int allStudentsTaskDone;
    private Mentor mentor;
    private boolean isAllTaskDone;

    public Student(String name, String surname, int age, Mentor mentor) {
        super(name, surname, age);
        this.countTaskDone = 0;
        this.mentor = mentor;
        this.isAllTaskDone = false;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public int getCountTaskDone() {
        return countTaskDone;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public boolean isAllTaskDone() {
        return isAllTaskDone;
    }

    public static int getAllStudentsTaskDone() {
        return allStudentsTaskDone;
    }

    public void solveTasks(int countTaskToSolve, Task[] tasks) {
        if (this.isAllTaskDone){return;}

        if (countTaskToSolve + this.countTaskDone > tasks.length) {
            countTaskToSolve = tasks.length - countTaskDone;
        }
        int start = this.countTaskDone;
        for (int i = start; i < start + countTaskToSolve; i++) {
            solveTask(tasks[i]);
        }

        if (tasks.length == countTaskDone) {
            this.isAllTaskDone = true;
            System.out.printf("Студент %s %s выполнил все задания\n", this.getName(), this.getSurname());
        }
        else {
            System.out.println("Еще не все задачи решены");
        }
    }

    private void solveTask(Task task) {
        boolean check;
        if (!(task instanceof Autochecked)){
            do {
                check = this.mentor.checkCode(task);
            }
            while (!check);
        }
        System.out.printf("Задача №%d решена\n", task.number);
        this.countTaskDone += 1;
        if (this.countTaskDone > getAllStudentsTaskDone()) {
            allStudentsTaskDone = this.countTaskDone;
        }
    }
}
