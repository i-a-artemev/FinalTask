public interface Autochecked {
    default void TaskDone() {
        System.out.println("Задание выполнено");
    }
}
