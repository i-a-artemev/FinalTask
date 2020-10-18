public class DragAndDrop extends Task implements Autochecked {
    private final String[][] choices;

    public DragAndDrop() {
        super();
        this.choices = new String[][]{{"a", "b"},{"c", "d"}};
    }

    public DragAndDrop(int number) {
        super(number);
        this.choices = new String[][]{{"a", "b"},{"c", "d"}};
    }
}
