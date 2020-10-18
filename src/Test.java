public class Test extends Task implements Autochecked {
    private final String[] answers;

    public Test() {
        super();
        this.answers = new String[]{"a", "b", "c"};
    }

    public Test(int number) {
        super(number);
        this.answers = new String[]{"a", "b", "c"};

    }
}
