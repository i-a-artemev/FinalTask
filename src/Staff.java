public interface Staff {
    void helpStudent(Student student);
    default void giveAdditionalStuff() {
        System.out.println("https://habr.com/ru/");
    }
}
