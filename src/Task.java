public abstract class Task {
    int number;
    final String taskText;

    public Task() {
        this.number = 0;
        this.taskText = "Blablabla";
    }

    public Task(int number){
        this();
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
