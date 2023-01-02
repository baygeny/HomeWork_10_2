public class PrinterSon2 extends Printer{
    protected String ANSI = "\u001B[32m";
    public void print(String value) {
        System.out.println(ANSI + value + ANSI_RESET);
    }
}
