public class Printer {
    protected String ANSI = "\u001B[34m";
    protected String ANSI_RESET = "\u001B[0m";

    public void print(String value) {
        System.out.println(ANSI + value + ANSI_RESET);
    }
}
